package main;

import commands.*;
import java.util.Stack;

/**
 * The layer between the client and the commands that need to be executed on the receivers (DiagramCanvas and DiagramComponent).
 * <br>
 * It is independent of the subtypes of commands, it just receives a command, runs it and implements a redo/undo mechanism.
 */
public class Invoker {

    /**
     * Clear up all the used resources, start fresh :D
     */
    private Stack<DrawCommand> undo; //i put in undo when i execute for the first time
    private Stack<DrawCommand> redo; //pun in redo the undo commands

    public Invoker() {
        this.undo = new Stack<>();
        this.redo = new Stack<>();
    }

    public void restart() {
      // TODO
        this.undo.clear();
        this.redo.clear();
        this.undo = new Stack();
        this.redo = new Stack();
    }

    /**
     * Executes a given command
     * @param command
     */
    public void execute(DrawCommand command) {
        command.execute();
        this.undo.add(command);
    }

    /**
     * Undo the latest command
     */
    public void undo() {
        // TODO
        // Hint: use data structures to keep track of commands
        // Do not use the java.util.Stack, its implementation is based on vector which is inefficient and deprecated.
        // Use a class that implements the Deque interface, e.g. LinkedList https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Deque.html
        DrawCommand command = (DrawCommand) this.undo.pop();
        this.redo.add(command);
        command.undo();

    }

    /**
     * Redo command previously undone. Cannot perform a redo after an execute, only after at least one undo.
     */
    public void redo() {
        // TODO
        DrawCommand command = (DrawCommand) this.redo.pop();
        this.undo.add(command);
        command.execute();
    }
}
