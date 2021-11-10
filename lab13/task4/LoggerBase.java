package task4;

import java.util.EnumSet;

public abstract class LoggerBase {
    EnumSet<LogLevel> level;
    LoggerBase next = null;
    String message = null;

    public LoggerBase(EnumSet<LogLevel> level) {
        this.level = level;
    }

    public void setNext(LoggerBase loggerBase) {
        this.next = loggerBase;
    }

    abstract protected void writeMessage();

    abstract public void message(String message, LogLevel loggerBase);
}
