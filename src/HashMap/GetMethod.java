//Program to illustrate HashMap get(Object key_element) method 
package HashMap;

import java.util.HashMap;

public class GetMethod {

    public static void main(String[] args) {
        HashMap<Integer, String> hash_map = new HashMap<>();

        hash_map.put(1703176, "Sushil");
        hash_map.put(1702636, "Gourav Deshwal");
        hash_map.put(1702629, "Gagan");
        hash_map.put(1702639, "Gurleen");

        System.out.println("Created HashMap Is: " + hash_map);

        String get_value = hash_map.get(1702639);

        System.out.println("Get value from HashMap: " + get_value);
    }

}
