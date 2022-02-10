package COMPOSITE;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //WE HAVE THE LEAF OBJECTS
        Component hard = new Leaf(4000, "HARD DRIVE");
        Component mouse = new Leaf(5000, "MOUSE");
        Component monitor = new Leaf(8000, "MONITOR");
        Component ram = new Leaf(3000, "RAM");
        Component cpu = new Leaf(9000, "CPU");


        //NOW WE NEED COMPONENT OBJ
        //periphery obj
        Composite ph = new Composite("PERIPHERY");
        Composite cabinet = new Composite("CABINET");
        Composite mb = new Composite("MB");
        Composite computer = new Composite("COMPUTER");

        ph.addComponent(mouse);
        ph.addComponent(monitor);

        mb.addComponent(cpu);
        mb.addComponent(ram);

        cabinet.addComponent(hard);
        cabinet.addComponent(mb);

        computer.addComponent(ph);
        computer.addComponent(cabinet);

        computer.showPrice();

    }
}
