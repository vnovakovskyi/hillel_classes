package logger;

public class LoggerConfig {
    private LogLevel level;
    private String filePath;

    public LoggerConfig(LogLevel level, String filePath) {
        this.level = level;
        this.filePath = filePath;
    }

    public LogLevel getLevel() {
        return level;
    }

    public String getFilePath() {
        return filePath;
    }
}
