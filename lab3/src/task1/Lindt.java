package task1;

public class Lindt extends CandyBox {
    private float length;
    private float width;
    private float height;

    public Lindt() {}

    public Lindt(String flavor, String origin, float length, float width, float height) {
        super(flavor, origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + " has volume - >" + this.getVolume();
    }

    @Override
    public float getVolume() {
        return this.height * this.height * this.length;
    }

    public void printDim() {
        System.out.println("l: " + this.length + " w: " + this.width +
                " h: " + this.height);
    }
}
