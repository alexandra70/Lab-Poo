package task1.document;

import task1.DocumentVisitor;

public class UrlSegment extends TextSegment {

    //constructor
    //private String url;
    private String description;



    public UrlSegment(String text, String description){
        super(text);//aici url, asa e facut
        this.description = description;
       //this.url = url;
    }
    //nu amgetter petnru description ,  pentur text - url este ca se apeleeaza leo mama
    //da altfel nu e eok

    public String getUrl() {
        return super.getContent();
    }

    public String getDescription() {
        return this.description;
    }


    @Override
    public void accept(DocumentVisitor v) {
         v.visit(this);
    }
}
