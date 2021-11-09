package task1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMultiMapValue {
    private MultiMapValue<String, String> map;

    @BeforeEach
    public void setup() {
        map = new MultiMapValue<>();
    }

    @AfterEach
    public void clean() {
        map = null;
    }

    @Test
    public void testAddElementWithOneValue() {
        map.add("key", "value");
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals(1, map.size());
        Assertions.assertEquals(1, map.getValues("key").size());
    }

    @Test
    public void testAddElementWithMoreValues() {
        map.add("key", "value1");
        map.add("key", "value2");
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals(1, map.size());
        Assertions.assertEquals(2, map.getValues("key").size());
    }

    @Test
    public void testAddTwoElements() {
        // TODO
        map.add("key", "value1");
        map.add("key", "value2");
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals(1, map.size());
        Assertions.assertEquals(2, map.getValues("key").size());
    }

    @Test
    public void testGetFirst() {
        // TODO
        map.add("key", "value1");
        map.add("key", "value2");
        map.add("key2", "3");
        map.add("key2", "4");
        map.add("key2", "5");
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals("value1", map.getFirst("key"));
        Assertions.assertEquals("3", map.getFirst("key2"));
    }

    @Test
    public void testContainsKey() {
        // TODO
        map.add("key", "value1");
        map.add("key", "value2");
        Assertions.assertFalse(map.containsKey("no"));
        Assertions.assertTrue(map.containsKey("key"));
    }

    @Test
    public void testSize() {
        // TODO
        map.add("key", "value1");
        map.add("key", "value2");
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals(1, map.size());
        map.add("key", "value1");
        map.add("key", "value2");
        Assertions.assertEquals(1, map.size());
        map.add("key3", "value3");
        map.add("key3", "value4");
        Assertions.assertEquals(2, map.size());
    }

    @Test
    public void testRemoveKey() {
        // TODO
        map.add("key", "value1");
        map.add("key", "value2");
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals(1, map.size());
        map.add("key", "value1");
        map.add("key", "value2");
        Assertions.assertEquals(1, map.size());
        map.add("key3", "value3");
        map.add("key3", "value4");
        Assertions.assertEquals(2, map.size());
        map.remove("key3");
        Assertions.assertEquals(1, map.size());
        map.remove("key");
        Assertions.assertTrue(map.isEmpty());


    }

    @Test
    public void testAddAllWithList() {
        // TODO
        map.add("key", "value1");
        map.add("key", "value2");
        List<String> arrayList = Arrays.asList("ana", "Are", "mere");
        Assertions.assertFalse(map.containsKey("no"));
        Assertions.assertTrue(map.containsKey("key"));
    }

    @Test
    public void testAddAllWithMultiMapValue() {
        // TODO
        map.add("key", "value1");
        map.add("key", "value2");

        MultiMapValue multiMapValue = new MultiMapValue();

        multiMapValue.add("red", "1");
        multiMapValue.add("red", "2");
        multiMapValue.add("blue", "10");
        multiMapValue.add("blue", "20");


        map.addAllS(multiMapValue);
        Assertions.assertTrue(map.containsKey("red"));
        Assertions.assertTrue(map.containsKey("key"));
        Assertions.assertTrue(map.containsKey("blue"));

    }
}
