package COMMAND1;

//----------------RECEIVER------------//

public class Television implements ElectronicDevice{

    //receiver called television, this will implements this
    //very specific commands.
    private int volume = 0 ;

    @Override
    public void on() {
        System.out.println("tv is on");
    }

    @Override
    public void off() {
        System.out.println("tv is off");
    }

    @Override
    public void volumeUp() {
        this.volume++;
        System.out.println("tv-volume is going up - > " + this.volume);
    }

    @Override
    public void volumeDown() {
        this.volume--;
        System.out.println("tv-volume is going down - > " + this.volume);
    }
}
