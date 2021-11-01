package third;

public class Operation implements Minus, Plus, Mult, Div{

    private float number;

    public Operation(float number) {
        this.number = number;
    }

    public float getNumber() {
        return number;
    }

    public void setNumber(float number) {
        this.number = number;
    }

    @Override
    public float div(float number) {
        if(number != 0)
            this.number = this.number / number;
        return this.number;
    }

    @Override
    public float minus(float number) {
        this.number -= number;
        return this.number;
    }

    @Override
    public float mult(float number) {
        this.number *= number;
        return (float)this.number;
    }

    @Override
    public float plus(float number) {
        this.number += number;
        return this.number;
    }
}
