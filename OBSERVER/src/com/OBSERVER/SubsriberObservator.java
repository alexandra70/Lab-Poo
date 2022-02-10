package com.OBSERVER;

public class SubsriberObservator implements Observer {

    private String name;
    private Channel channel;

    public SubsriberObservator(String name){
        this.name = name;
        this.channel = new Channel();
    }

    public void update(){
        //or a more fancier thing
        System.out.println(this.name);
        System.out.println("-VIDEO UPLOADED->" + channel.getTitle());
    }

    public void subscribeChannel(Channel ch){
        this.channel = ch;
    }


}
