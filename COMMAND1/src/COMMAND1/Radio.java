package COMMAND1;

public class Radio implements ElectronicDevice{

    //receiver called radio, this will implements this
    //very specific commands.
    private int volume = 0 ;

    @Override
    public void on() {
        System.out.println("radio is on");
    }

    @Override
    public void off() {
        System.out.println("radio is off");
    }

    @Override
    public void volumeUp() {
        this.volume++;
        System.out.println("radio-volume is going up - > " + this.volume);
    }

    @Override
    public void volumeDown() {
        this.volume--;
        System.out.println("radio-volume is going down - > " + this.volume);
    }
}
