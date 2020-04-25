//Program to illustrate TreeMap put(key, value) method
package TreeMap;

import java.util.TreeMap;

public class PutMethod {

    public static void main(String[] args) {
        TreeMap<Integer, String> tree_map = new TreeMap<>();

        tree_map.put(98, "Rahul");
        tree_map.put(76, "Sushil");
        tree_map.put(39, "Gurleen");
        tree_map.put(30, "Gaurav");
        tree_map.put(29, "Gagan");

        System.out.println("Created TreeMap Is: " + tree_map);
    }
}
