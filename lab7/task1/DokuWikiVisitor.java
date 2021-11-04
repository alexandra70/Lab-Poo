package task1;

public class DokuWikiVisitor implements DocumentVisitor{

    StringBuilder stringBuilder = new StringBuilder();

    @Override
    public void visit(ItalicTextSegment italicTextSegment) {
        stringBuilder.append("//");
        stringBuilder.append(italicTextSegment.getContent());
        stringBuilder.append("//");
    }

    @Override
    public void visit(BoldTextSegment boldTextSegment) {
        stringBuilder.append("**");
        stringBuilder.append(boldTextSegment.getContent());
        stringBuilder.append("**");
    }

    @Override
    public void visit(UrlSegment urlSegment) {
        stringBuilder.append("[[");
        stringBuilder.append(urlSegment.getUrl());
        stringBuilder.append("|");
        stringBuilder.append(urlSegment.getContent());
        stringBuilder.append("]]");
    }

    @Override
    public void visit(PlainTextSegment plainTextSegment) {
        stringBuilder.append(plainTextSegment.getContent());
    }

    @Override
    public StringBuilder getDocument() {
        return this.stringBuilder;
    }
}
