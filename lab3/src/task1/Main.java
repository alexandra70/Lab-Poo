package task1;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here

        CandyBox box = new CandyBox("capsuni", "spania");
        Lindt cutiuta1 = new Lindt("capsuni", "spania", 1, 1, 3);
        Lindt cutiuta2 = new Lindt("portocale", "iatlia", 4, 1, 3);
        ChocAmor cutiuta3 = new ChocAmor("dulceata", "din suflet", 10);
        ChocAmor cutiuta4 = new ChocAmor("iubire", "din suflet", 100);
        //fac upcasting

        int a = 5;

        //System.out.println(box.toString());
        //System.out.println(cutiuta1.toString());

        //System.out.println(box.equals(cutiuta1));
        //System.out.println(box.equals(cutiuta2));
        //System.out.println(box.equals(a));


        ArrayList<CandyBox> list = new ArrayList<CandyBox>();
        list.add(cutiuta1);
        list.add(cutiuta2);

        //System.out.println("aici cadou: " + list);

        ChocAmor c1 = new ChocAmor("pere", "uk", 3);
        ChocAmor c2 = new ChocAmor("mere", "ro", 2);
        ChocAmor c3 = new ChocAmor("porto", "spania", 5);
        Lindt c4 = new Lindt("pere", "uk", 1, 1, 1);
        Lindt c5 = new Lindt("mere", "ro", 2, 2, 1);
        Lindt c6 = new Lindt("porto", "italia", 3, 3, 1);
        Baravelli c7 = new Baravelli("capsuni", "spania", 1, 2);


        CandyBag cadoul2 = new CandyBag();

        cadoul2.add(c1);
        cadoul2.add(c2);
        cadoul2.add(c3);
        cadoul2.add(c4);
        cadoul2.add(c5);
        cadoul2.add(c6);
        cadoul2.add(c7);

        cadoul2.toString();
        CandyBox x;
        String s = "stada";

        Area zone = new Area(cadoul2, 10, s);
        zone.getBirthdayCard();
    }
}