package task1;


public class Complex {
    private int real;
    private int imaginary;

    public Complex(int real, int imaginary) {
        this.real = 0;
        this.imaginary = 0;
    }

    public Complex() {
        this(0, 0);
    }

    public Complex(Complex element) {
        this.real = element.real;
        this.imaginary = element.imaginary;
    }

    public int getReal() {
        return this.real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return this.imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    void addWithComplex(Complex nr) {
        this.real += nr.real;
        this.imaginary += nr.imaginary;
    }

    void showNumber(Complex nr) {
        System.out.println("re:" + nr.real + "im:" + nr.imaginary);
    }
}
