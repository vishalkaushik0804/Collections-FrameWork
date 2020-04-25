// Program to illustrate Introduction to TreeMap
//The map is sorted according to the natural ordering of its keys
package TreeMap;

import java.util.TreeMap;

public class TreeMap1 {

    public static void main(String[] args) {
        TreeMap<Integer, String> tree_map = new TreeMap<>();

        tree_map.put(1, "One");
        tree_map.put(5, "Five");
        tree_map.put(2, "Two");
        tree_map.put(3, "Three");
        tree_map.put(4, "Four");

        System.out.println("Created TreeMap Is: " + tree_map);
    }

}
