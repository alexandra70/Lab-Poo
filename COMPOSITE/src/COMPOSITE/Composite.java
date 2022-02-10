package COMPOSITE;

import java.util.ArrayList;

public class Composite implements Component{


    private String name;

    //we want to create a ist of objects - COMPONENT OBJECTS
    private ArrayList<Component> components = new ArrayList<Component>();

    public Composite(String name){
        this.name = name;
    }

    //the composite should be able to add or remove the components
    public void addComponent(Component component){
        this.components.add(component);
    }

    @Override
    public void showPrice() {
        System.out.println(name);
        //this will work like a iteration first we take a component
        //and for each component we will print the price just for
        //the leaf nodes, he tries to do that.
        for(Component component: this.components){
            component.showPrice();
        }
    }
}
