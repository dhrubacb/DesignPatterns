import main.java.gof.structural.decorator.ProcessingFeeDecorator;
import main.java.gof.structural.decorator.TransactionFeeDecorator;

void main() {
    ProcessingFeeDecorator processingFeeDecorator;
    processingFeeDecorator = new ProcessingFeeDecorator(new TransactionFeeDecorator(() -> 20));

    IO.println("Total Amount: " + processingFeeDecorator.getAmount());
}
