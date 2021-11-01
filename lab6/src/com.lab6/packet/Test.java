package packet;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        Car car1 = new Car(20, Car.CarType.dacia, 2015);
        Car car2 = new Car(30, Car.CarType.dacia, 2016);
        Car car3 = new Car(40, Car.CarType.dacia, 2017);
        Car car4 = new Car(60, Car.CarType.bmw, 2010);
        Car car5 = new Car(100, Car.CarType.passat, 2021);

        //cu asta pot accesa preturile dupa discount prin el se fac
        Dealership dealer = new Dealership();
        //dealer.getFinalPrice(car1);
        //dealer.getFinalPrice(car2);
        //dealer.getFinalPrice(car3);
        //dealer.getFinalPrice(car4);
        //dealer.getFinalPrice(car5);


        //declarare clasa anonima - apare in program ca o instanta a unei clase mostenite sau a unei interete
        Offer offer = new Offer() {
            @Override
            public int getDiscount(Car car) {
                return 10;
            }
        };

        System.out.println(car1.getPrice());
        car1.setPrice(dealer.getFinalPrice(car1));
        dealer.negotiate(car1, offer);
        System.out.println(car1.getPrice());

        car2.setPrice(dealer.getFinalPrice(car2));
        dealer.negotiate(car2, offer);
        car3.setPrice(dealer.getFinalPrice(car3));
        dealer.negotiate(car3, offer);
        car4.setPrice(dealer.getFinalPrice(car4));
        dealer.negotiate(car4, offer);
        car5.setPrice(dealer.getFinalPrice(car5));
        dealer.negotiate(car5, offer);


        Car car6 = new Car(10, Car.CarType.dacia, 2015);
        Car car7 = new Car(20, Car.CarType.dacia, 2016);
        Car car8 = new Car(30, Car.CarType.dacia, 2017);
        Car car9 = new Car(40, Car.CarType.bmw, 2010);
        Car car10 = new Car(50, Car.CarType.passat, 2021);

        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);

        System.out.println(cars.toString());

        cars.removeIf((car) -> car.getPrice() > 25);

        cars.stream().forEach(car -> {
            if(car.getPrice() > 100) {
                cars.remove(car);
            }
        });

        System.out.println(cars.toString());

        for (Car c : cars) {
            System.out.println("[" + c + "]");
        }
    }
}
