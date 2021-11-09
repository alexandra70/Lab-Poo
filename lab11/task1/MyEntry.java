package task1;

import java.util.ArrayList;

public class MyEntry<K, V> {
     private K key;
     private ArrayList<V> values;

    public MyEntry() {
    }

    public void setKey(K key) {
        this.key = key;
        this.values = new ArrayList<V>();
    }

    public void removeContent() {
        this.key = null;
        this.values = null;
    }

    public K getKeyOfEntry() {
        return this.key;
    }

    public ArrayList<V> getValues() {
        return this.values;
    }

    public V getFirst() {
        return this.values.get(0);
    }

    public void addValue(V value) {
        if(this.values.isEmpty() || !this.values.contains(value)) {
            this.values.add(value);
        }
    }
}
