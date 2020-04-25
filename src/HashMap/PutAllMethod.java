//Program to illustrate HashMap putAll(exist_hash_map) method
package HashMap;

import java.util.HashMap;

public class PutAllMethod {

    public static void main(String[] args) {
        HashMap<Integer, String> hash_map1 = new HashMap<>();

        hash_map1.put(1, "One");
        hash_map1.put(2, "Two");
        hash_map1.put(3, "Three");
        hash_map1.put(4, "Four");
        hash_map1.put(5, "Five");

        System.out.println("Created HashMap1 Is: " + hash_map1);

        HashMap<Integer, String> hash_map2 = new HashMap<>();
        hash_map2.putAll(hash_map1);
        hash_map2.put(6, "Six");

        System.out.println("Created HashMap2 Is: " + hash_map2);

    }
}
