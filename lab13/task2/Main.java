package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // TODO: Initialize the calculator
        Calculator calculator = new Operations();

        System.out.println(calculator.add(2d, 3d));
        System.out.println(calculator.divide(9d, 4d));
        System.out.println(calculator.average(Arrays.asList(1d, 2d, 3d, 4d)));

        // TODO: Test edge cases that would throw exceptions

        try {
            calculator.add(null, null);
        } catch (Calculator.NullParameterException e ) {
            System.out.println("null params");
        }
        try {
            calculator.add(Double.POSITIVE_INFINITY, Double.valueOf(10));
        } catch (Calculator.OverflowException e) {
            System.out.println("one param value is positive-inf");
        }
        try {
            calculator.add(Double.NEGATIVE_INFINITY, Double.valueOf(10));
        } catch (Calculator.UnderflowException e) {
            System.out.println("one param value is negative-inf");
        }
        try {
            calculator.divide(10d, 0d);
        }
        catch (ArithmeticException arithmeticException) {
            System.out.println("do not divide by zero");
        }
        ArrayList<Double> doubles = null;
        try {
            calculator.average(doubles);
        }
        catch (Calculator.NullParameterException nullParameterException) {
            System.out.println("the list is not existing");
        }
        ArrayList<Double> doubles1 = new ArrayList<>();
        try {
            calculator.average(doubles1);
        }
        catch (ArithmeticException arithmeticException) {
            System.out.println("the list is empty");
        }
    }
}
