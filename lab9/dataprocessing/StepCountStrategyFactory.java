package dataprocessing;


import main.Utils;
import storage.SensorData;

import java.util.ArrayList;

public class StepCountStrategyFactory {

    public StepCountStrategyFactory() { }

    public StepCountStrategy getStrategy(String strategy, ArrayList<SensorData> sensorData) {
        if(strategy.equals(Utils.BASIC_STRATEGY)) {
            return new BasicStepCountStrategy(sensorData);
        }
        if(strategy.equals(Utils.FILTERED_STRATEGY)) {
            return new FilteredStepCountStrategy(sensorData);
        }
        return null;
    }

}
