package task1;

import task1.document.TextSegment;

import javax.xml.soap.Text;
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
        DokuWikiVisitor doku = new DokuWikiVisitor();

        for(TextSegment text: textSegments){

            text.accept(doku);
        }

        return doku.getDocument();
    }

    public StringBuilder getMarkdownDocument() {
        // TODO apply Markdown visitor on the text segments
        MarkdownVisitor mark = new MarkdownVisitor();
        for(TextSegment text: textSegments){

            //pentru fiecae string accept sa fie vizitat si o sa fie modificat
            //eu doar tebuie sa returne la sfrasit sirull totl pe care la m construit
            text.accept(mark);

        }
        return mark.getDocument();
    }
}
