package COMMAND1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //this will return a television
        ElectronicDevice electronicDevice = TVRemote.getDevice();

        //have to crete a command to be applied on device
        TurnTVOn turnTVOn = new TurnTVOn(electronicDevice);

        //invoker
        DeviceButton deviceButton = new DeviceButton(turnTVOn);


       deviceButton.press();

       //..........................

        //have to crete a command to be applied on device
        TurnTVOff turnTVOff = new TurnTVOff(electronicDevice);

        //invoker
        deviceButton = new DeviceButton(turnTVOff);

        deviceButton.press();

        //.........................

        TurnTVUp turnTVUp = new TurnTVUp(electronicDevice);

        //invoker
        deviceButton = new DeviceButton(turnTVUp);

        deviceButton.press();
        deviceButton.press();
        deviceButton.press();
        deviceButton.press();
        deviceButton.press();

        //......................

        ElectronicDevice radio = new Radio();
        ElectronicDevice television = new Television();
        //need more commands and more electronic devices

        ArrayList<ElectronicDevice> electronicDevices = new ArrayList<ElectronicDevice>();
        electronicDevices.add(radio);
        electronicDevices.add(television);

        TurnItAllOff turnItAllOff = new TurnItAllOff(electronicDevices);

        deviceButton = new DeviceButton(turnItAllOff);

        deviceButton.press();

        deviceButton.pressUndo();


    }
}
