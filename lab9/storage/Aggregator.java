package storage;

import dataprocessing.StepCountStrategy;

import java.util.Observable;
import java.util.Observer;

public class Aggregator implements Observer {

    private StepCountStrategy strategy; //composition

    public Aggregator(StepCountStrategy stepCountStrategy) {
        this.strategy = stepCountStrategy;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(this.strategy.getStrategyDescription());
        System.out.println(this.strategy.getTotalSteps());
    }
}
