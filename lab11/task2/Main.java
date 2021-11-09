package task2;

import task2.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {

    public static <T extends Summable> int sum(Collection<T> collection) {
        int total = 0;
        for(T summable : collection){
            total += summable.sum();
        }
        return total;
    }

    public static void main(String[] args) {

        MyVector3 vector1 = new MyVector3(1, 1, 1);
        MyVector3 vector2 = new MyVector3(2, 2, 2);
        MyVector3 vector3 = new MyVector3(3, 3, 3);


        System.out.println(vector1.toString());
        vector1.addValue(vector2);
        System.out.println(vector1.toString());

        vector1.addValue(vector3);
        System.out.println(vector1.toString());

        vector1.addValue(vector1);
        System.out.println(vector1.toString());


        MyMatrix matrix1 = new MyMatrix();
        matrix1.setMatrix(new int[][]{{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}, {4, 4, 4, 4}});

        MyMatrix matrix2 = new MyMatrix();
        matrix2.setMatrix(new int[][]{{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}, {4, 4, 4, 4}});

        MyMatrix matrix3 = new MyMatrix();
        matrix3.setMatrix(new int[][]{{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}, {4, 4, 4, 4}});

        matrix1.toString();
        matrix1.addValue(matrix2);
        System.out.println();
        matrix1.toString();

        matrix2.toString();
        matrix2.addValue(matrix1);
        System.out.println();
        matrix2.toString();


        ArrayList<Summable> arrayList = new ArrayList<>();
        arrayList.add(vector3);
        arrayList.add(vector3);
        arrayList.add(vector3);
        arrayList.add(matrix3);


        System.out.println(vector3);
        System.out.println("all elements added " + sum(arrayList));
    }
}
