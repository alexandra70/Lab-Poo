package task3;

public class Polygon {

    private int n;
    private Point[] points;

    public Polygon(int n){
        this.n = n;
        this.points = new Point[n];
    }


    public Polygon(float[] puncte){
        this(puncte.length/2);

        for(int i = 0 ; i < puncte.length; i+=2){
            this.points[i/2] = new Point(puncte[i], puncte[i+1]);
        }
    }

    void printPoints() {
        for(int i = 0; i < this.n; i++) {
            System.out.println(points[i]);
        }
    }
}
