package com.Factory;

public class Main {

    public static void main(String[] args) {
	// write your code here


        OS operating = new Android();
        OS operating2 = new Windows();
        OS operating3 = new IOS();

        operating.specifications();
        operating2.specifications();
        operating3.specifications();

        //the problem is that we expose the real type of our
        //object -> if we want an android object we have
        //to init a new object that is telling us what it is
        //so all we have to do for hiding the effective creation
        //of a specific type of object is to make a new class
        //and its main and unique aim is to make instances of
        //objects and return them under its name;


        //we need just a instance of an osf object
        //to proceed the following actions, like make an
        //instance by accessing the method of osf object
        //with an argument that will gave us the right instance
        OperatingSystemFactory o = new OperatingSystemFactory();

        OS obj1 = o.getInstance("ANYTHING IS POSSIBEL");
        OS obj2 = o.getInstance("OPEN");
        OS obj3 = o.getInstance("SECURE");

        obj1.specifications();
        obj2.specifications();
        obj3.specifications();



    }
}
