package task1;

public class CounterOutTask implements Task{

    private static int nr = 0;

    public CounterOutTask() {
        nr++;
        this.execute(); // print
    }

    @Override
    public void execute() {
        System.out.println(nr);
    }
}
