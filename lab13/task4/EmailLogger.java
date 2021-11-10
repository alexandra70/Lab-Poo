package task4;

import java.util.EnumSet;

public class EmailLogger extends LoggerBase {
    public EmailLogger(EnumSet<LogLevel> level) {
        super(level);
    }

    @Override
    protected void writeMessage() {
        System.out.println("[Email] " + super.message);
    }

    @Override
    public void message(String message, LogLevel logLevel) {
        if(super.level.contains(logLevel)) {
            super.message = message;
            this.writeMessage();
        }
        if(next == null) return;
        super.next.message(message, logLevel);
    }
}