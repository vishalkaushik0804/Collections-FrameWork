//Program to illustrate TreeMap lowerKey(K key) method
package TreeMap;

import java.util.TreeMap;

public class LowerKeyMethod {

    public static void main(String[] args) {
        TreeMap<Integer, String> tree_map = new TreeMap<>();

        tree_map.put(10, "Ten");
        tree_map.put(20, "Twenty");
        tree_map.put(30, "Thirty");
        tree_map.put(40, "Forty");
        tree_map.put(50, "Fifty");

        System.out.println("Created TreeMap Is: " + tree_map);

        System.out.println("Lower Key Entry of Element 20 is: " + tree_map.lowerKey(20));
    }
}
