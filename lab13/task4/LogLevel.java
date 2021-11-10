package task4;

import sun.rmi.runtime.Log;

import java.util.EnumSet;

public enum LogLevel {
    Info,
    Debug,
    Warning,
    Error,
    FunctionalMessage,
    FunctionalError;

    public static EnumSet<LogLevel> all() {
        //creating an enum-set;
        return EnumSet.allOf(LogLevel.class);
    }
}
