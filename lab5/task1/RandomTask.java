package task1;

import java.util.Random;

public class RandomTask implements Task{

    private int nr;

    public RandomTask() {
        Random random = new Random();
        this.nr = random.nextInt();

    }

    @Override
    public void execute() {
        System.out.println(this.nr);
    }
}