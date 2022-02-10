package com.STRATEGY;

public class Bird extends Animal {

    public Bird(String name, double height, int weight) {
        super(name, height, weight);
        //whenever ou bird-object is build we are gonna saying
        //that is type is equal to the subclass of interface
        //that corresponds to its ability, to its functionality
        this.setFlyType(new ItFly());
    }
    
}
