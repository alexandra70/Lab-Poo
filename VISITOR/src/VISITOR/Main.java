package VISITOR;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //need a visitor for taxes
        TaxVisitor taxVisitor = new TaxVisitor();

        Necessity necessity = new Necessity(300);
        Tobacco tobacco = new Tobacco(100);
        Liquor liquor = new Liquor(200);

        //we to accept and require for each object to
        //be visited

        System.out.println(necessity.getPrice());
        System.out.println(tobacco.getPrice());
        System.out.println(liquor.getPrice());

        System.out.println(necessity.accept(taxVisitor));
        System.out.println(tobacco.accept(taxVisitor));
        System.out.println(liquor.accept(taxVisitor));

    }
}
