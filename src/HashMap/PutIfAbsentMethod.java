//Program to illustrate HashMap putIfAbsent(K key, V value) method
package HashMap;

import java.util.HashMap;

public class PutIfAbsentMethod {

    public static void main(String[] args) {
        HashMap<Integer, String> hash_map = new HashMap<>();

        hash_map.put(1, "One");
        hash_map.put(2, "Two");
        hash_map.put(3, "Three");
        hash_map.put(4, "Four");
        hash_map.put(5, "Five");

        System.out.println("Created HashMap Is: " + hash_map);

        hash_map.putIfAbsent(6, "Six");

        System.out.println("Created Cone of the HashMap Is: " + hash_map);
    }
}
