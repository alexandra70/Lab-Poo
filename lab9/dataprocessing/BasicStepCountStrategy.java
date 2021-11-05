package dataprocessing;

import main.Utils;
import storage.SensorData;

import javax.rmi.CORBA.Util;
import java.util.ArrayList;

public class BasicStepCountStrategy implements StepCountStrategy{

    private int steps;
    private ArrayList<SensorData> sensorData;

    public BasicStepCountStrategy(ArrayList<SensorData> sensorData) {
        this.steps = 0;
        this.sensorData = sensorData;
    }

    @Override
    public int getTotalSteps() {
        sensorData.forEach(sensorData1 -> this.steps += sensorData1.getStepsCount());
        return this.steps;
    }

    @Override
    public String getStrategyDescription() {
        return Utils.BASIC_STRATEGY;
    }
}
