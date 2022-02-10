package task1.document;

import task1.DocumentVisitor;

public class PlainTextSegment extends TextSegment{


    //constructor pentru plain text
    //apelex constructorul lui super pe text sa imi fac el asta
    //pentru a mea metoda

    ///INceasca si cu farasuper pls
    public PlainTextSegment(String text){
        super(text);
    }

    public void accept(DocumentVisitor v){
//viziteaza obictul curent - pls
         v.visit(this);

    }



}
