package task1;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Complex x = new Complex();
        x.setImaginary(2);
        x.setReal(1);
        x.showNumber(x);
        x.addWithComplex(x);
        x.showNumber(x);
        x.addWithComplex(x);
        x.showNumber(x);
        x.addWithComplex(x);
        x.showNumber(x);
    }
}
