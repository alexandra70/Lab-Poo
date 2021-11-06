package commands;

import diagram.DiagramCanvas;
import diagram.DiagramComponent;

public class ChangeText implements DrawCommand {

    private DiagramCanvas diagramCanvas;
    private String newText;
    private String oldText;
    private int id;

    public ChangeText(DiagramCanvas diagramCanvas, int id,  String newText) {
        this.diagramCanvas = diagramCanvas;
        this.oldText = diagramCanvas.getComponent(id).getText();
        this.newText = newText;
        this.id = id;
    }

    @Override
    public void execute() {
        this.diagramCanvas.getComponent(this.id).setText(this.newText);
    }

    @Override
    public void undo() {
        this.diagramCanvas.getComponent(this.id).setText(this.oldText);
    }

    @Override
    public String toString() {
        return "ChangeText{" +
                "diagramCanvas=" + diagramCanvas +
                ", newText='" + newText + '\'' +
                ", oldText='" + oldText + '\'' +
                ", id=" + id +
                '}';
    }
}
