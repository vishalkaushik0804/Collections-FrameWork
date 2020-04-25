//Program to illustrate TreeMap subMap(K startKey, K endKey) method
package TreeMap;

import java.util.TreeMap;

public class SubMapMethod {

    public static void main(String[] args) {
        TreeMap<Integer, String> tree_map = new TreeMap<>();

        tree_map.put(10, "Ten");
        tree_map.put(20, "Twenty");
        tree_map.put(30, "Thirty");
        tree_map.put(40, "Forty");
        tree_map.put(50, "Fifty");

        System.out.println("Created TreeMap Is: " + tree_map);

        System.out.println("The SubMap Is: "+tree_map.subMap(20, 50));
    }
}
