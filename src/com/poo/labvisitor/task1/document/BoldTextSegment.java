package task1.document;

import task1.DocumentVisitor;

public class BoldTextSegment extends TextSegment {

    //folosesc stringul din mama
    //nu mmai adaug unul nou aici si il folosesc pe ala
    //cu super
    //ii dau asta cand se intoarce
    public BoldTextSegment(String text){
        super(text);
    }

    @Override
    public void accept(DocumentVisitor v) {
         v.visit(this);
    }
}
