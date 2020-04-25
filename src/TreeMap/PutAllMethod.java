//Program to illustrate TreeMap putAll(exist_hash_map) method
package TreeMap;

import java.util.TreeMap;

public class PutAllMethod {

    public static void main(String[] args) {
        TreeMap<Integer, String> tree_map1 = new TreeMap<>();

        tree_map1.put(1, "One");
        tree_map1.put(2, "Two");
        tree_map1.put(3, "Three");
        tree_map1.put(4, "Four");
        tree_map1.put(5, "Five");

        System.out.println("Created TreeMap1 Is: " + tree_map1);

        TreeMap<Integer, String> tree_map2 = new TreeMap<>();
        tree_map2.putAll(tree_map1);
        tree_map2.put(6, "Six");

        System.out.println("Created TreeMap2 Is: " + tree_map2);

    }
}
