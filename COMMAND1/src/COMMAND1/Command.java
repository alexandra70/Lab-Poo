package COMMAND1;

//interface for commands, each command have to implement this

public interface Command {

    public void execute();
    public void undo();
    //after that we can use this interface
    //to implement some very specific commands

}
