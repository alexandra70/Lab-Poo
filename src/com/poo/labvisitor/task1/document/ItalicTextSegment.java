package task1.document;

import task1.DocumentVisitor;

public class ItalicTextSegment extends TextSegment{

    public ItalicTextSegment(String text){
        //ma refer la constructorul la parinte aici
        //efectiv il folosesc ca ele nu au text
        super(text);
    }

    @Override
    public void accept(DocumentVisitor v) {
         v.visit(this);
    }


}
