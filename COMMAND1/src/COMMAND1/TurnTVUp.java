package COMMAND1;

public class TurnTVUp implements Command {

    private ElectronicDevice electronicDevice;

    public TurnTVUp(ElectronicDevice electronicDevice){
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        this.electronicDevice.volumeUp();
    }

    @Override
    public void undo() {
        this.electronicDevice.volumeDown();
    }
}
