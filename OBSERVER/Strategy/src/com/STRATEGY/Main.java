package com.STRATEGY;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Animal dog = new Dog("rex", 1,4);
        Animal bird = new Bird("tweety", 1,1);

        System.out.println(bird.tryToFly());
        System.out.println(dog.tryToFly());


        System.out.println("now our dog will change his ability->");
        dog.setFlyType(new ItFly());
        System.out.println(dog.tryToFly());

    }
}
