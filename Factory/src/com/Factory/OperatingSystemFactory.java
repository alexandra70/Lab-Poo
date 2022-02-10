package com.Factory;

public class OperatingSystemFactory {

    //return an OS object, depending by passing value
    //we will receive an instance to a specific type
    public OS getInstance(String str){

        if(str.equals("OPEN"))
            return new Android();
        else if(str.equals("SECURE")) {
            return new IOS();
        }
        else
            return new Windows();
    }


}
