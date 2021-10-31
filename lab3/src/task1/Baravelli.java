package task1;

import java.nio.file.attribute.BasicFileAttributes;

public class Baravelli extends CandyBox {

    private float height;
    private float radius;

    public Baravelli() { }

    public Baravelli(String flavor, String origin, float height, float radius) {
        super(flavor, origin);
        this.height = height;
        this.radius = radius;
    }


    @Override
    public float getVolume() {
        return (float)Math.PI * (float)Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        return super.toString() + " has volume - >" + this.getVolume();
    }

    public void printBaravelliDim()  {
        System.out.println("r: " + this.radius + " h: " + this.height);
    }


}
