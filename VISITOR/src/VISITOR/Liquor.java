package VISITOR;

public class Liquor implements Visitable{

    private double price;

    Liquor(double price){
        this.price = price;
    }

    //accept method for this object, give it
    //what it wants
    public double accept(Visitor visitor){
        return visitor.visit(this);
    }

    public double getPrice(){
        return this.price;
    }

}
