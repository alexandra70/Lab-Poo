package task3;

public class Main {
    public static void main(String[] args) {
        // write your code here

        Point punct1= new Point(2f, 5f);
        System.out.println(punct1);

        float[] puncte = {1f, 2f, 3f, 4f, 5f, 6f};

        Polygon polygon = new Polygon(puncte);

        polygon.printPoints();

    }
}
