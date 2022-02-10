package VISITOR;

import java.text.DecimalFormat;

public class TaxVisitor implements Visitor {

    public TaxVisitor(){}

    @Override
    public double visit(Liquor liquor) {
        System.out.println("L item");
        return liquor.getPrice() * 10 + liquor.getPrice();
    }

    @Override
    public double visit(Tobacco tobacco) {
        System.out.println("T item");
        return tobacco.getPrice() + tobacco.getPrice() * 15;
    }

    @Override
    public double visit(Necessity necessity) {
        System.out.println("N item");
        return necessity.getPrice() + necessity.getPrice() * 0;
    }
}
