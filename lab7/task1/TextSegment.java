package task1;

public abstract class TextSegment {

    private String content;

    TextSegment(String content) {
        this.content = content;
    }

    public abstract void accept(DocumentVisitor documentVisitor);

    public String getContent() {
        return this.content;
    }
}
