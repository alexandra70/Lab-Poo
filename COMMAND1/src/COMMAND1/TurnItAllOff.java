package COMMAND1;


import java.util.ArrayList;

//command that turn off all our objects-devices
public class TurnItAllOff implements Command{

    ArrayList<ElectronicDevice> electronicDevices = new ArrayList<ElectronicDevice>();

    public TurnItAllOff(ArrayList<ElectronicDevice> electronicDevices){
        this.electronicDevices = electronicDevices;
    }

    //since i want to be able to turn all of the off
    //i'm going to need all electronic devices stored in
    //a - let's say an arraylist

    @Override
    public void execute() {
        for(ElectronicDevice electronicDevice: electronicDevices){
            electronicDevice.off();
        }
    }

    @Override
    public void undo() {
        for(ElectronicDevice electronicDevice: electronicDevices){
            electronicDevice.on();
        }
    }
}
