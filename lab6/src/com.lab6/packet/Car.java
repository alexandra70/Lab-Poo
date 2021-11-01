package packet;

public class Car {

    enum CarType{
        dacia,
        bmw,
        passat
    }
    private int price;
    private CarType type;
    private int year;


    public Car(int price,CarType type, int year){
        this.price = price;
        this.type = type;
        this.year = year;
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getYear(){
        return this.year;
    }

    public CarType getType(){
        return this.type;
    }

    public String toString(){
        return this.type + " " + this.year + " " + this.price + "mii";
    }
}
