package task2;

import java.util.Collection;

public class Operations implements Calculator{

    @Override
    public Double add(Double nr1, Double nr2) {
        if (nr1 == null || nr2 == null) {
            throw new NullParameterException();
        }
        if ( nr1 + nr2 == Double.NEGATIVE_INFINITY) {
            throw new UnderflowException();
        }
        if ( nr1 + nr2 == Double.POSITIVE_INFINITY) {
            throw new OverflowException();
        }
        return nr1 + nr2;
    }

    @Override
    public Double divide(Double nr1, Double nr2) {

        if (nr1 == null || nr2 == null) {
            throw new NullParameterException();
        }

        if (nr2 == 0) {
            throw new ArithmeticException();
        }

        if (nr1.isInfinite() || nr2.isInfinite()) {
            throw new OverflowException();
        }

        return nr1/nr2;
    }

    @Override
    public Double average(Collection<Double> numbers) {
        double sum = 0.0;

        if (numbers == null) {
            throw new NullParameterException();
        }

        if (numbers.size() == 0) {
            throw new ArithmeticException();
        }

        for(Double d : numbers) {
            sum = this.add(sum, d);
        }
        return this.divide(sum, (double) numbers.size());
    }
}
