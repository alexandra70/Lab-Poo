package commands;

import diagram.DiagramCanvas;
import diagram.DiagramComponent;

public class Resize implements DrawCommand {

    private DiagramCanvas diagramCanvas;
    private DiagramComponent diagramComponent;
    private float percent;
    private int id;

    public Resize(DiagramCanvas diagramCanvas, int id, float percent) {
        this.diagramCanvas = diagramCanvas;
        this.diagramComponent = diagramCanvas.getComponent(id);
        this.percent = percent;
        this.id = id;
    }

    @Override
    public void execute() {
        this.diagramComponent.setHeight(Math.round(diagramComponent.getHeight() * percent));
        this.diagramComponent.setWeight(Math.round(diagramComponent.getWeight() * percent));
    }

    @Override
    public void undo() {
        this.diagramComponent.setHeight(Math.round(diagramComponent.getHeight() / percent));
        this.diagramComponent.setWeight(Math.round(diagramComponent.getWeight() / percent));
    }

    @Override
    public String toString() {
        return "Resize{" +
                "diagramComponent=" + diagramComponent +
                ", percent=" + percent +
                '}';
    }
}