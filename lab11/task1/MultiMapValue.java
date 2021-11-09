package task1;

import task1.MyEntry;
import java.util.*;


public class MultiMapValue<K, V> {

    private ArrayList<MyEntry<K, V>> myMap = new ArrayList<>(); // has a

    public ArrayList<MyEntry<K, V>> getMyMap() {
        return this.myMap;
    }

    public void add(K key, V value) {
        // TODO
        //a key is associated with more values
        if(containsKey(key)) {
            if(!getValues(key).contains(value)) {
                getValues(key).add(value);
            }
        } else {
            MyEntry entry = new MyEntry();
            entry.setKey(key);
            entry.addValue(value);
            System.out.println(key);
            System.out.println(entry.getValues().size());
            myMap.add(entry);
        }
    }

    public void addAll(K key, List<V> values) {
        // TODO
        for (V value : values) {
            this.add(key, value);
        }
    }

    public void addAllS(MultiMapValue<K, V> map) {
        // TODO
        for (MyEntry myEntry : map.getMyMap()) {
            this.addAll((K) myEntry.getKeyOfEntry(), myEntry.getValues());
        }
    }

    public V getFirst(K key) {
        // TODO
        for(MyEntry myEntry : this.myMap) {
            if (key.equals(myEntry.getKeyOfEntry())) {
                return (V) myEntry.getFirst();
            }
        }
        return null;
    }

    public List<V> getValues(K key) {
        // TODO
        for(MyEntry myEntry: this.myMap) {
            if (myEntry.getKeyOfEntry().equals(key)) {
                return myEntry.getValues();
            }
        }

        return null;
    }

    public boolean containsKey(K key) {
        // TODO

        for(MyEntry myEntry: this.myMap) {
            if(myEntry.getKeyOfEntry().equals(key)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        // TODO
        if(this.myMap.isEmpty()) {
            return true;
        }
        return false;
    }

    public List<V> remove(K key) {
        // TODO
        List<V> list = null;
        for (MyEntry myEntry : this.myMap) {
            if (myEntry.getKeyOfEntry().equals(key)) {
                list = myEntry.getValues();
                this.myMap.remove(myEntry);
                return list;
            }
        }
        return null;
    }
    public int size() {
        // TODO
        return this.myMap.size();
    }
}
