//Program to illustrate TreeMap get(Object key_element) method 
package TreeMap;

import java.util.TreeMap;

public class GetMethod {

    public static void main(String[] args) {
        TreeMap<Integer, String> tree_map = new TreeMap<>();

        tree_map.put(1703176, "Sushil");
        tree_map.put(1702636, "Gourav Deshwal");
        tree_map.put(1702629, "Gagan");
        tree_map.put(1702639, "Gurleen");

        System.out.println("Created TreeMap Is: " + tree_map);

        String get_value = tree_map.get(1702639);

        System.out.println("Get value from TreeMap: " + get_value);
    }

}
