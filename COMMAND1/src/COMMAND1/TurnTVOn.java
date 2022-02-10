package COMMAND1;

public class TurnTVOn implements Command{

    //this command will need to know witch - exactly - is the
    //electronic device do you want me to be working with
    private ElectronicDevice electronicDevice;

    public TurnTVOn(ElectronicDevice electronicDevice){
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        //we want to call the on method on our electronic - device
        this.electronicDevice.on();
    }

    @Override
    public void undo() {
        //obviously it will do the opposite
        this.electronicDevice.off();
    }
}
