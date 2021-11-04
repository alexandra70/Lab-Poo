package task1;

public class BoldTextSegment extends TextSegment {

    BoldTextSegment(String content) {
        super(content);
    }

    @Override
    public void accept(DocumentVisitor documentVisitor) {
        documentVisitor.visit(this);
    }
}
