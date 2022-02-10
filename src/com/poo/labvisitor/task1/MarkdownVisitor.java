package task1;

import task1.document.BoldTextSegment;
import task1.document.ItalicTextSegment;
import task1.document.PlainTextSegment;
import task1.document.UrlSegment;

public class MarkdownVisitor implements DocumentVisitor{


    private StringBuilder str;

    public MarkdownVisitor(){
        str = new StringBuilder();
    }

    @Override
    public void visit(ItalicTextSegment text) {
        this.str.append("*");
        this.str.append(text.getContent());
        this.str.append("*");
        return;// this.str;
    }

    @Override
    public void visit(BoldTextSegment text) {
        this.str.append("**");
        this.str.append(text.getContent());
        this.str.append("**");
        return;// this.str;
    }

    @Override
    public void visit(UrlSegment text) {
        this.str.append("[");
        this.str.append(text.getContent());
        this.str.append("]");
        this.str.append("(");
        this.str.append(text.getDescription());
        this.str.append(")");
        return;// this.str;
    }

    @Override
    public void visit(PlainTextSegment text) {
        this.str.append(text.getContent());
        return;// this.str;
    }

    @Override
    public StringBuilder getDocument() {
        return this.str;
    }
}
