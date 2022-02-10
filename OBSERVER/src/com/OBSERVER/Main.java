package com.OBSERVER;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Channel tobeobserved = new Channel();

        SubsriberObservator sub1 = new SubsriberObservator("Ana");
        SubsriberObservator sub2 = new SubsriberObservator("Cna");
        SubsriberObservator sub3 = new SubsriberObservator("Bna");
        SubsriberObservator sub4 = new SubsriberObservator("Dna");
        SubsriberObservator sub5 = new SubsriberObservator("Ena");


        //add observers to in list of the observable object
        tobeobserved.addSub(sub1);
        tobeobserved.addSub(sub2);
        tobeobserved.addSub(sub3);
        tobeobserved.addSub(sub4);
        tobeobserved.addSub(sub5);

        //every subscriber have to know the channel they have subscribed to
        sub1.subscribeChannel(tobeobserved);
        sub2.subscribeChannel(tobeobserved);
        sub3.subscribeChannel(tobeobserved);
        sub4.subscribeChannel(tobeobserved);
        sub5.subscribeChannel(tobeobserved);

        //make a modification in observable that notify all all observers

        tobeobserved.upload("OBSERVERS - OBSERVABLE");


    }
}
