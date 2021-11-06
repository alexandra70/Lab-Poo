package builder;

public class TestHouse {

    public static void main(String[] args) {
        House house = new House.HouseBuilder("msms", "vela", 10).solarPanels("solarpan").appliance("microunde").appliance("frigider").build();
        System.out.println(house.toString());
    }
}
