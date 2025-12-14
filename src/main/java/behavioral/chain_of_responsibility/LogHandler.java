package main.java.behavioral.chain_of_responsibility;

public class LogHandler {
    private LogHandler nextHandler;
    private final int minLevel;

    public LogHandler(int minLevel) {
        this.minLevel = minLevel;
    }

    public void setNextHandler(LogHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(int level, String message) {
        if (level == minLevel) {
            System.out.println(getLogPrefix(minLevel) + ": " + message);
        }
        if (level > minLevel && nextHandler != null) {
            nextHandler.handle(level, message);
        }
    }

    private String getLogPrefix(int level) {
        return switch (level) {
            case 1 -> "INFO";
            case 2 -> "DEBUG";
            case 3 -> "ERROR";
            default -> "UNKNOWN";
        };
    }
}
