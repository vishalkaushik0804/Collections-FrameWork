//Program to illustrate TreeMap clear() method
package TreeMap;

import java.util.TreeMap;

public class ClearMethod {

    public static void main(String[] args) {
        TreeMap<Integer, String> tree_map = new TreeMap<>();

        tree_map.put(1, "Program");
        tree_map.put(2, "For");
        tree_map.put(3, "Clear");
        tree_map.put(4, "Method");

        System.out.println("Created TreeMap Is: " + tree_map);

        tree_map.clear();

        System.out.println("TreeMap after Clear operation: " + tree_map);
    }
}
