//Program to illustrate TreeMap clone() method
package TreeMap;

import java.util.TreeMap;

public class CloneMethod {

    public static void main(String[] args) {
        TreeMap<Integer, String> tree_map = new TreeMap<>();

        tree_map.put(1, "One");
        tree_map.put(2, "Two");
        tree_map.put(3, "Three");
        tree_map.put(4, "Four");
        tree_map.put(5, "Five");

        System.out.println("Created TreeMap Is: " + tree_map);

        TreeMap<Integer, String> tree_map_clone;
        tree_map_clone = (TreeMap) tree_map.clone();

        System.out.println("Created Cone of the TreeMap Is: " + tree_map_clone);
    }
}
