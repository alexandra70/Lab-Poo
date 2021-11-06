package commands;

import diagram.DiagramCanvas;
import diagram.DiagramComponent;

public class ChangeColor implements DrawCommand {

    private DiagramCanvas diagramCanvas;
    private String newColor;
    private String oldColor;
    private int id;

    public ChangeColor(DiagramCanvas diagramCanvas,int id, String newColor) {
        this.diagramCanvas = diagramCanvas;
        this.newColor = newColor;
        this.oldColor = diagramCanvas.getComponent(id).getColor();
        this.id = id;
    }
    @Override
    public void execute() {
        diagramCanvas.getComponent(this.id).setColor(this.newColor);
    }

    @Override
    public void undo() {
        diagramCanvas.getComponent(this.id).setColor(this.oldColor);
    }

    @Override
    public String toString() {
        return "ChangeColor{" +
                "diagramCanvas=" + diagramCanvas +
                ", newColor='" + newColor + '\'' +
                ", oldColor='" + oldColor + '\'' +
                ", id=" + id +
                '}';
    }
}