package task1;

public class Area {
    private CandyBag candyBag;
    private int number;
    private String street;

    public Area(CandyBag candyBag, int number, String street) {
        this.candyBag = candyBag;
        this.number = number;
        this.street = street;
    }

    public void getBirthdayCard() {
        System.out.println("Str. " + this.street + ", nr:"
                + this.number + "\nLa multi ani!\n");
        this.candyBag.toString();
        for(CandyBox candyBox : this.candyBag.getBox()) {
            candyBox.toString();
            candyBox.printDim(); //trebuie definita in casa candyBox, altfle
            //trebuie verificat fiecare tip(pt fiecare cutie in parte) si mai apoi accesata metoda de printDim
        }
    }

}
