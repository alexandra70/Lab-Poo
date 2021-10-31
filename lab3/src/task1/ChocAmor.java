package task1;

public class ChocAmor extends CandyBox{
    private float length;

    public ChocAmor() {
    }

    public ChocAmor(String flavor, String origin, float lenght){
        super(flavor, origin);
        this.length = lenght;
    }


    @Override
    public float getVolume() {
        return (float)Math.pow(length, 3);
    }

    @Override
    public String toString() {
        return super.toString() + " has volume - >" + this.getVolume();
    }

    public void printDim(){
        System.out.println(" l: " + this.length);
    }

}
