package main;

import commands.*;
import diagram.DiagramCanvas;

/**
 * Receives commands in clear text from the user and transforms them in DrawCommand objects. It uses the Invoker to
 * execute the given commands.
 */

public class Client {

    private Invoker invoker;
    private DiagramCanvas diagramCanvas;

    Client() {
        invoker = new Invoker();
        diagramCanvas = new DiagramCanvas();
    }

    public void showDiagram() {
        // TODO
        this.diagramCanvas.show();
    }

    public void newDiagram() {
        // TODO
        this.diagramCanvas = new DiagramCanvas();
    }

    public void executeAction(String commandName, String ...args) {
        // TODO - uncomment:
        DrawCommand command;
        try {
            CommandType commandType = CommandType.fromString(commandName);
            command = getCommand(commandType, args);
            if (command == null) {
                throw new IllegalArgumentException();
            }

        } catch(IllegalArgumentException ex) {
            System.out.println("Invalid command: " + commandName);
            System.out.println("Available commands:");
            for (CommandType type : CommandType.values()) {
                System.out.println("\t- " + type.text);
            }
            return;
        }

        // TODO - Execute the action
        this.invoker.execute(command);

    }

    private DrawCommand getCommand(CommandType type, String ...args) throws IllegalArgumentException {
        // TODO factory method to create DrawCommand subclasses.
        // If there is an exception when parsing the string arguments (NumberFormatException) catch it and
        // throw an IllegalArgumentException

        if(type.equals(CommandType.CHANGE_COLOR)) {
            int args0 = Integer.parseInt(args[0]);
            return new ChangeColor(this.diagramCanvas, args0, args[1]);
        }

        if(type.equals(CommandType.DRAW_RECTANGLE)){
            return new DrawRectangle(this.diagramCanvas);
        }

        if(type.equals(CommandType.CHANGE_TEXT)){
            int args0 = Integer.parseInt(args[0]);
            return new ChangeText(this.diagramCanvas, args0, args[1]);
        }

        if(type.equals(CommandType.RESIZE)){
            int args0 = Integer.parseInt(args[0]);
            float args1 = Float.parseFloat(args[1]);
            return new Resize(this.diagramCanvas, args0, args1);
        }

        if(type.equals(CommandType.CONNECT)){
            int args0 = Integer.parseInt(args[0]);
            int args1 = Integer.parseInt(args[1]);
            return new ConnectComponents(this.diagramCanvas, args0, args1);
        }

        throw new IllegalArgumentException();
    }

    public void undo(){
        // TODO
        this.invoker.undo();
    }

    public void redo() {
        // TODO
        this.invoker.redo();
    }
}