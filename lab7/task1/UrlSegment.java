package task1;

public class UrlSegment extends TextSegment{

    private String url;
    private String description;

    public String getUrl() {
        return url;
    }

    public UrlSegment(String url, String description) {
        super(description);
        this.url = url;
    }


    @Override
    public void accept(DocumentVisitor documentVisitor) {
        documentVisitor.visit(this);
    }
}
