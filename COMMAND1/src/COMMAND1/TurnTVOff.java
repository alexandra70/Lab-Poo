package COMMAND1;

public class TurnTVOff implements Command{

    private ElectronicDevice electronicDevice;

    public TurnTVOff(ElectronicDevice electronicDevice){
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        this.electronicDevice.off();
    }

    @Override
    public void undo() {
        this.electronicDevice.on();
    }
}
