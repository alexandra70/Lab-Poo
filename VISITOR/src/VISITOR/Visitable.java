package VISITOR;

public interface Visitable {

    //allows visitor to pass the object, so the right
    //operation occurs on the right type of object.

    public double accept(Visitor visitor);

}
