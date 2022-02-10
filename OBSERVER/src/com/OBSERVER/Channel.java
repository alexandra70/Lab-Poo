package com.OBSERVER;

import java.util.ArrayList;

public class Channel implements Observable {

    private String title;
    private ArrayList<SubsriberObservator> subs = new ArrayList<SubsriberObservator>();


    //Channel can add observers and can eliminate them
    //if we want to
    public void addSub(SubsriberObservator sub){
        this.subs.add(sub);
    }

    public void unsubscribeSub(SubsriberObservator sub){
        this.subs.remove(sub);
    }

    //method to notify subs - all observers
    public void notifySub(){
        for(SubsriberObservator sub : subs){
            //call update method for all observers, and tell them
            //that something has changed
            sub.update();
        }
    }

    //any modification that is important for observers
    //make a mh and notify all observers about that
    public void upload(String title){
        this.title = title;
        notifySub();
    }

    public String getTitle(){
        return this.title;
    }

}
