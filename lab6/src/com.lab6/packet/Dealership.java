package packet;

import packet.Car;
import packet.Offer;

public class Dealership {


    private class BrandOffer implements Offer {

        @Override
        public int getDiscount(Car car) {
            int discount = 0;
            if(car.getType() == Car.CarType.dacia) {
                //deci dc e o dacia, atunci se va aplica discountul in felul urmator
                discount = (car.getPrice() * 5) / 100;
                return discount;
            }
            if (car.getType() == Car.CarType.bmw) {
                discount = (car.getPrice() * 10) / 100;
                return discount;
            }
            if (car.getType() == Car.CarType.passat) {
                discount = (car.getPrice() * 15) / 100;
                return discount;
            }
            return discount;
        }
    }

    private class DealerOffer implements Offer {


        public int getDiscount(Car car) {
            int val = 2021 - car.getYear();
            int discount = (val * car.getPrice()) / 100;
            return discount;
        }

    }

    private class SpecialOffer implements Offer {

        public int getDiscount(Car car){
            int luckyyear1 = 2010;
            int luckyyear2 = 2015;
            int discount = 0;
            if(car.getYear() == luckyyear1 || car.getYear() == luckyyear2){
                discount = car.getPrice()/4;
                return discount;
            }
            return discount;
        }

    }


    public int getFinalPrice(Car car) {
        BrandOffer brandOffer = new BrandOffer();
        int d = brandOffer.getDiscount(car);

        DealerOffer dealerOffer = new DealerOffer();
        int dd = dealerOffer.getDiscount(car);

        SpecialOffer specialOffer = new SpecialOffer();
        int ddd = specialOffer.getDiscount(car);

        int finalprice = car.getPrice();
        finalprice -= d - dd - ddd;

        System.out.println("Initial price: " + car.getPrice());
        System.out.println("Applying Brand discount: " + d + "\nApplying Dealer discount: " + dd + "\nApplying Special discount: " + ddd);
        System.out.println("Final price: " + finalprice + " mii euros");
        return finalprice;

    }

    void negotiate(Car car, Offer offer){

        int myoffer = (int)(Math.random() * 3);

        //nu aplic oferata
        if(myoffer == 1) {
            offer.getDiscount(car);
            car.setPrice(car.getPrice() - offer.getDiscount(car));
            System.out.println("Applying Client discount: " + offer.getDiscount(car));
            System.out.println("Final price after negotiation: " + car.getPrice() + "\n");
            return;
        }


        System.out.println("NOT Applying Client discount: " + offer.getDiscount(car));
        System.out.println("Final price after -NO- negotiation: " + car.getPrice() + "\n");

        return;
    }

}
