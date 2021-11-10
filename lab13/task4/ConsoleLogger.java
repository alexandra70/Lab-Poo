package task4;

import java.util.EnumSet;

//it will write all logLevel types
public class ConsoleLogger extends LoggerBase{
    public ConsoleLogger(EnumSet<LogLevel> level) {
        super(level);
    }

    @Override
    protected void writeMessage() {
        System.out.println("[Console] " + super.message);
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