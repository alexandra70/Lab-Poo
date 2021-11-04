package task1;

import java.util.List;

/**
 * Uses visitors to parse documents and provide dokuwiki and markdown outputs.
 */
public class WikiGenerator {

    private final List<TextSegment> textSegments;

    public WikiGenerator(List<TextSegment> textSegments) {
        this.textSegments = textSegments;
    }

    public StringBuilder getDokuWikiDocument() {
        // TODO apply dokuwiki visitor on the text segments
        DokuWikiVisitor dokuWikiVisitor = new DokuWikiVisitor();
        for(TextSegment text : textSegments) {
            text.accept(dokuWikiVisitor);
        }
        //dupa visit am stringul format
        return dokuWikiVisitor.getDocument();
    }

    public StringBuilder getMarkdownDocument() {
        // TODO apply Markdown visitor on the text segments
        MarkdownVisitor markdownVisitor = new MarkdownVisitor();
        for (TextSegment textSegment : textSegments) {
            textSegment.accept(markdownVisitor);
        }
        return markdownVisitor.getDocument();
    }
}
