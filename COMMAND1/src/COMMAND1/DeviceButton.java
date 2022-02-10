package COMMAND1;

// -----------INVOKER----------//

public class DeviceButton {

    //it's going to be passed a command ->
    Command command;

    public DeviceButton(Command command){
        this.command = command;
    }

    public void press(){
        this.command.execute();
    }

    public void pressUndo(){
        this.command.undo();
    }

    //public void

}
