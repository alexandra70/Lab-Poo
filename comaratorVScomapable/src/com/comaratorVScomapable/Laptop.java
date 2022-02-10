package com.comaratorVScomapable;
//COMPARABLE
//public class Laptop implements Comparable<Laptop>{


public class Laptop{

    private String brand;
    private int ram;
    private int price;

    public Laptop(String brand, int ram, int price){
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public String getBrand(){
        return this.brand;
    }

    public int getRam(){
        return this.ram;
    }

    public int getPrice(){
        return this.price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public String toString(){
        return "BRAND -> " + this.brand +
               " RAM -> " + this.ram +
               " PRICE -> "  + this.price;
    }

    //COMPARABLE + -> swap
//    @Override
//    public int compareTo(Laptop laptop) {
//        if(this.ram > laptop.ram){
//            return 1;
//        }
//        return -1;
//    }

    //COMPARATOR



}
