//Program to illustrate TreeMap remove(Object key) method 
package TreeMap;

import java.util.TreeMap;

public class RemoveMethod {

    public static void main(String[] args) {
        TreeMap<Integer, String> tree_map = new TreeMap<>();

        tree_map.put(12, "This");
        tree_map.put(13, "is");
        tree_map.put(14, "Remove");
        tree_map.put(15, "Method");
        tree_map.put(16, "Program");

        System.out.println("Created HashMap Is: " + tree_map);

        String remove_value = (String) tree_map.remove(16);

        System.out.println("TreeMap after Remove operation: " + tree_map);
        System.out.println("Remove Value of TreeMap: " + remove_value);
    }
}
