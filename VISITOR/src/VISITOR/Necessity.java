package VISITOR;

public class Necessity implements Visitable{

    public double price;

    Necessity(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public double accept(Visitor visitor){
        return visitor.visit(this);
    }


}
