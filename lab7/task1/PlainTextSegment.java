package task1;

public class PlainTextSegment extends TextSegment{

    PlainTextSegment(String content) {
        super(content);
    }

    @Override
    public void accept(DocumentVisitor documentVisitor) {
        documentVisitor.visit(this);
    }
}
