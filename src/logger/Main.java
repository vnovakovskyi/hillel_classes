package logger;

public class Main {
    public static void main(String[] args) {
        LoggerConfig loggerConfig = new LoggerConfig(LogLevel.DEBUG, "C://User...");
        Logger.setUpLogger(loggerConfig);

        System.out.println("Sample text");
        Logger.log("Log text");
        System.out.println("Sample text");
        Logger.log("Log text");
        System.out.println("Sample text");
        Logger.log("Log text");
        System.out.println("Sample text");
    }
}
