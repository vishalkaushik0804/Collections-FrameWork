//Program to illustrate TreeMap floorKey(K key) method 
package TreeMap;

import java.util.TreeMap;

public class FloorKeyMethod {

    public static void main(String[] args) {
        TreeMap<Integer, String> tree_map = new TreeMap<>();

        tree_map.put(6, "Six");
        tree_map.put(1, "One");
        tree_map.put(5, "Five");
        tree_map.put(3, "Three");
        tree_map.put(8, "Eight");
        tree_map.put(10, "Ten");

        System.out.println("Created TreeMap Is: " + tree_map);

        System.out.println("Floor Entry(Key) of Element 11 is: "+tree_map.floorKey(11));
    }
}
