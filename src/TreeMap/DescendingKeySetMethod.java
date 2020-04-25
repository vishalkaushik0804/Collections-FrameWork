//Program to illustrate TreeMap descendingKeySet() method 
package TreeMap;

import java.util.NavigableSet;
import java.util.TreeMap;

public class DescendingKeySetMethod {

    public static void main(String[] args) {
        TreeMap<Integer, String> tree_map = new TreeMap<>();

        tree_map.put(6, "Six");
        tree_map.put(1, "One");
        tree_map.put(5, "Five");
        tree_map.put(3, "Three");
        tree_map.put(8, "Eight");
        tree_map.put(10, "Ten");

        System.out.println("Created TreeMap Is: " + tree_map);

        NavigableSet descending_key_set = tree_map.descendingKeySet();

        System.out.println("DescendingKeySet Created Is: " + descending_key_set);
    }
}
