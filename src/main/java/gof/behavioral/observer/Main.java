package main.java.gof.behavioral.observer;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    static void main() throws InterruptedException {
        Stock apl = new Stock("APL", 212.00d);
        Observer investor1 = (msg) -> IO.println("Investor:: " + msg);
        apl.attach(investor1);

        var executorService = Executors.newVirtualThreadPerTaskExecutor();

        executorService.submit(() -> {
            apl.updatePrice(220.00d);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            apl.updatePrice(210.00d);

        });
        executorService.shutdown();
        executorService.awaitTermination(2, TimeUnit.SECONDS);
        apl.detach(investor1);
        apl.updatePrice(200.00d);
    }
}
