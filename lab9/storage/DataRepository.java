package storage;


import javafx.beans.InvalidationListener;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * Persists sensor data. Observable, its observers are notified when data is added it to.
 */
public class DataRepository extends Observable { // TODO make this an Observable

    private ArrayList<SensorData> data = new ArrayList<SensorData>();
    private ArrayList<Observer> observers = new ArrayList<Observer>();

    public DataRepository() {

    }

    public void addData(SensorData dataRecord){
        // TODO
        // store data (e.g. in a List)
        // notifiy observers
        this.data.add(dataRecord);
        this.observers.forEach(observer -> observer.update(this, dataRecord));
        //notifyObservers(dataRecord); // notify only about recent added data
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    // TODO implement a method to get the stored data (needed by the strategies)
    public ArrayList<SensorData> getStoredData() {
        return this.data;
    }
}


