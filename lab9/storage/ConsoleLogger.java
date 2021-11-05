package storage;

import java.util.Observable;
import java.util.Observer;
/*
* console logger prints the changes
* */
public class ConsoleLogger implements Observer {

    public ConsoleLogger() {
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg);
    }
}
