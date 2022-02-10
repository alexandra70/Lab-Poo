package com.STRATEGY;

public class Animal {

    private String name;
    private double height;
    private int weight;

    //this is the way to apply strategy
    //we want object that can take the subclass from interface
    //fly to be applied on its object => composition
    //instead of inheritance of an object, the class that we got
    //is COMPOSED with objects by that type, this in not inherit it

    private Flys flytype;

    public Animal(String name, double height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
       // this.flytype = flytype;
    }

    //the important method that allows us to
    //change the type of class that our object uses
    public void setFlyType(Flys flytype){
        this.flytype = flytype;
    }

    public String getName(){
        return this.name;
    }

    public int getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String tryToFly(){
        return this.flytype.fly();
    }


}
