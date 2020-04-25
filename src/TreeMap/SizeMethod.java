//Program to illustrate TreeMap size() method
package TreeMap;

import java.util.TreeMap;

public class SizeMethod {

    public static void main(String[] args) {
        TreeMap<String, Integer> tree_map = new TreeMap<>();

        tree_map.put("Amazon", 1);
        tree_map.put("Google", 2);
        tree_map.put("Facebook", 3);
        tree_map.put("Intel", 4);
        tree_map.put("Samsung", 5);
        tree_map.put("Apple", 6);

        System.out.println("Created TreeMap Is: " + tree_map);

        System.out.println("Size of the TreeMap is: "+tree_map.size());
    }

}
