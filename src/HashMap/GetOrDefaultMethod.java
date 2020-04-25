//Program to illustrate HashMap  getOrDefault(Object key, V defaultValue) method
package HashMap;

import java.util.HashMap;

public class GetOrDefaultMethod {

    public static void main(String[] args) {
        HashMap<Integer, String> hash_map = new HashMap<>();

        hash_map.put(1, "One");
        hash_map.put(2, "Two");
        hash_map.put(3, "Three");
        hash_map.put(4, "Four");
        hash_map.put(5, "Five");

        System.out.println("Created HashMap Is: " + hash_map);

        String get_value = hash_map.getOrDefault(3, "Three");

        System.out.println("Returned value in the HashMap Is: " + get_value);
    }
}
