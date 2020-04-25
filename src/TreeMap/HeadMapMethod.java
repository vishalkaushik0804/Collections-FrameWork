//Program to illustrate TreeMap headMap(key_point) method
package TreeMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class HeadMapMethod {

    public static void main(String[] args) {
        TreeMap<Integer, String> tree_map = new TreeMap<>();

        tree_map.put(1, "One");
        tree_map.put(4, "Four");
        tree_map.put(6, "Six");
        tree_map.put(10, "Ten");
        tree_map.put(0, "Zero");

        System.out.println("Created TreeMap Is: " + tree_map);

        SortedMap<Integer, String> head_map;
        head_map = tree_map.headMap(7);

        System.out.println("Created HeadMap Is: " + head_map);
    }
}
