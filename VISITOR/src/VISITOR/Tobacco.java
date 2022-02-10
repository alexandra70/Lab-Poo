package VISITOR;

public class Tobacco implements Visitable{

    public double price;

    Tobacco(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public double accept(Visitor visitor){
        return visitor.visit(this);
    }

}
