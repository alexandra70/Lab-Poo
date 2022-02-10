package com.OBSERVER;

public interface Observable {

    public void addSub(SubsriberObservator sub);

    public void unsubscribeSub(SubsriberObservator sub);

    public void notifySub();

    public void upload(String title);

    public String getTitle();

}

