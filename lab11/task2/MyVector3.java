package task2;

public class MyVector3 implements Summable{
    private int x;
    private int y;
    private int z;

    public MyVector3(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    @Override
    public void addValue(Summable value) {
        this.x += ((MyVector3) value).getX();
        this.y += ((MyVector3) value).getY();
        this.z += ((MyVector3) value).getZ();
    }

    @Override
    public int sum() {
        return this.x + this.y + this.z;
    }


    @Override
    public String toString() {
        return "MyVector3{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
