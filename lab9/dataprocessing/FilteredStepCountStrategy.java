package dataprocessing;

import main.Utils;
import storage.SensorData;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class FilteredStepCountStrategy implements StepCountStrategy{

    private ArrayList<SensorData> data;
    private static final int MAX_DIFF_STEPS_CONSECUTIVE_RECORDS = 1000;
    private static final long TIME_FOR_MAX_DIFF = TimeUnit.SECONDS.toMillis(1);

    public FilteredStepCountStrategy(ArrayList<SensorData> data){
        this.data = data;
    }

    public int getTotalSteps(){
        int total = 0;
        for(SensorData pas : this.data){
            if(pas.getStepsCount() < 0 ||
                    pas.getStepsCount() > MAX_DIFF_STEPS_CONSECUTIVE_RECORDS)
                continue;
            total+=pas.getStepsCount();
        }
        return total;
    }

    public String getStrategyDescription(){
        return Utils.FILTERED_STRATEGY;
    }

}
