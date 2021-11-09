package task2;

import java.util.Arrays;

public class MyMatrix implements Summable{

    private int[][] matrix;

    public MyMatrix() {
        this.matrix = new int[4][4];
    }

    public void setMatrix(int [][] matrix){
        this.matrix = matrix;
    }


    public int[][] getMatrix() {
        return this.matrix;
    }

    @Override
    public void addValue(Summable value) {
        for(int i = 0; i < this.matrix.length; i ++){
            for(int j = 0 ; j < this.matrix.length; j++) {
                this.matrix[i][j] += (((MyMatrix)value).getMatrix())[i][j];
            }
        }
    }

    @Override
    public int sum() {
        int total = 0;
        for(int i = 0; i < this.matrix.length; i ++) {
            for (int j = 0; j < this.matrix.length; j++) {
                total += this.matrix[i][j];
            }
        }
        return total;
    }

    @Override
    public String toString() {
        return "MyMatrix{" +
                "matrix=" + Arrays.toString(matrix) +
                '}';
    }

}
