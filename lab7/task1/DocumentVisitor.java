package task1;

public interface DocumentVisitor {

    void visit(ItalicTextSegment italicTextSegment);
    void visit(BoldTextSegment boldTextSegment);
    void visit(UrlSegment urlSegment);
    void visit(PlainTextSegment plainTextSegment);
    StringBuilder getDocument();

}
