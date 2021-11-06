package commands;

import diagram.DiagramCanvas;
import diagram.DiagramComponent;

public class DrawRectangle implements DrawCommand {

    private DiagramCanvas diagramCanvas;
    private DiagramComponent diagramComponent;

    public DrawRectangle(DiagramCanvas diagramCanvas) {
        this.diagramCanvas = diagramCanvas;
        this.diagramComponent = new DiagramComponent();
    }

    @Override
    public void execute() {
        this.diagramCanvas.addComponent(this.diagramComponent);
    }

    @Override
    public void undo() {
        this.diagramCanvas.removeComponent(this.diagramComponent);
    }

    @Override
    public String toString() {
        return "DrawRectangle{" +
                "diagramCanvas=" + diagramCanvas +
                ", diagramComponent=" + diagramComponent +
                '}';
    }
}