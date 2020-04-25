//Program to illustrate TreeMap values() method
package TreeMap;

import java.util.TreeMap;

public class ValuesMethod {

    public static void main(String[] args) {
        TreeMap<Integer, String> tree_map = new TreeMap<>();

        tree_map.put(10, "Program");
        tree_map.put(20, "For");
        tree_map.put(30, "Values");
        tree_map.put(40, "Method");

        System.out.println("Created TreeMap Is: " + tree_map);

        System.out.println("Collection view of TreeMap: " + tree_map.values());
    }
}
