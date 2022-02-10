package com.comaratorVScomapable;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here


        ArrayList<Laptop> laptops = new ArrayList<Laptop>();

        laptops.add(new Laptop("DELL", 16, 800));
        laptops.add(new Laptop("APPLE", 8, 1200));
        laptops.add(new Laptop("ACER", 12, 700));

        //NOW WE WANT TO SORT THEM->

        //in this case we have a data type that
        //is more complex than a int Integer etc;
        //so we need to use one of two methods
        //first one is called comparable and in this one
        //the logic of sort have to be placed in the class
        //of objects that we need to sort
        //example: we want to sort students(objects) so
        //we override the sort method that is implemented
        //in collections interface in Student class
        //and we can access that method from wherever we
        //want.

        //the second one is comparator
        //this one refers to when we cant implement
        //collections interface, in this case we have to
        //give to sort method the logic of sort right in
        //the call of sort mh.

        //COMPARABLE
        //System.out.println(laptops.toString());
//        Collections.sort(laptops);
//        //System.out.println(laptops.toString());
//
//        for(Laptop laptop: laptops){
//            System.out.println(laptop.toString());
//        }


        //COMPARATOR

//        Comparator<Laptop> com = new Comparator<Laptop>() {
//
//            public int compare(Laptop l1, Laptop l2){
//                if(l1.getRam() > l2.getRam()){
//                    return 1;
//                }
//                else return -1;
//            }
//        };
//
//        Collections.sort(laptops, com);

        for(Laptop laptop: laptops) {
            System.out.println(laptop.toString());
        }


        Collections.sort(laptops, new Comparator<Laptop>(){
            public int compare(Laptop l1, Laptop l2){
                if(l1.getRam() > l2.getRam()){
                    return 1;
                }
                return -1;
            }
        });

        for(Laptop laptop: laptops) {
            System.out.println(laptop.toString());
        }

    }

}
