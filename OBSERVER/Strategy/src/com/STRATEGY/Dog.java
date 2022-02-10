package com.STRATEGY;

public class Dog extends Animal{


    public Dog(String name, double height, int weight) {
        super(name, height, weight);
        this.setFlyType(new ItCantFly());
    }

    public void digHole(){
        System.out.println("dig a hole");
    }

}
