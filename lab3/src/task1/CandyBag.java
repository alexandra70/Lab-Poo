package task1;

import java.util.ArrayList;

public class CandyBag {
    private ArrayList<CandyBox> candyBoxes;

    public CandyBag() {
        this.candyBoxes = new ArrayList<>();
    }

    public void add(CandyBox candyBox) {
        this.candyBoxes.add(candyBox);
    }

    public ArrayList<CandyBox> getBox() {
        return this.candyBoxes;
    }

    @Override
    public String toString() {
        return "CandyBag{" +
                "candyBoxes=" + candyBoxes +
                '}';
    }
}
