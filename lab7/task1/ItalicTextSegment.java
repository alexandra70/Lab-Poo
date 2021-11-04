package task1;

public class ItalicTextSegment extends TextSegment {

    ItalicTextSegment(String content) {
        super(content);
    }

    @Override
    public void accept(DocumentVisitor documentVisitor) {
        documentVisitor.visit(this);
    }
}
