package commands;

import diagram.DiagramCanvas;

public class ConnectComponents implements DrawCommand {

    private DiagramCanvas diagramCanvas;
    private int id1;
    private int id2;

    public ConnectComponents(DiagramCanvas diagramCanvas, int id1, int id2) {
        this.diagramCanvas = diagramCanvas;
        this.id1 = id1;
        this.id2 = id2;
    }

    @Override
    public void execute() {
        this.diagramCanvas.getComponent(this.id1).connectTo(Integer.toString(id2));
        this.diagramCanvas.getComponent(this.id2).connectTo(Integer.toString(id1));
    }

    @Override
    public void undo() {
        this.diagramCanvas.getComponent(this.id1).removeConnection(Integer.toString(id2));
        this.diagramCanvas.getComponent(this.id2).removeConnection(Integer.toString(id1));
    }

    @Override
    public String toString() {
        return "ConnectComponents{" +
                "diagramCanvas=" + diagramCanvas +
                ", id1=" + id1 +
                ", id2=" + id2 +
                '}';
    }
}