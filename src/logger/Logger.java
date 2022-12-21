package logger;

public class Logger {
    private static LoggerConfig loggerConfig;

    public static void setUpLogger(LoggerConfig config) {
        loggerConfig = config;
    }

    public static void log(String text) {
        if (loggerConfig.getLevel() == LogLevel.DEBUG) {
            debug(text);
        } else {
            info(text);
        }
    }

    private static void debug(String text) {
        System.out.println("[DEBUG] " + text);
    }

    private static void info(String text) {
        System.out.println("[INFO] " + text);
    }
}
