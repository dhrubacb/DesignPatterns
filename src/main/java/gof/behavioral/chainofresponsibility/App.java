package main.java.gof.behavioral.chainofresponsibility;

public class App {
    public static void main(String[] args) {
        LogHandler infoHandler = new LogHandler(1); // Handles INFO and above
        LogHandler debugHandler = new LogHandler(2); // Handles DEBUG and above
        LogHandler errorHandler = new LogHandler(3); // Handles ERROR and above

        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

        infoHandler.handle(1, "This is an info message.");
        infoHandler.handle(2, "This is a debug message.");
        infoHandler.handle(3, "This is an error message.");
        infoHandler.handle(4, "This is a unknown message."); // Will be handled by error handler
    }

}
