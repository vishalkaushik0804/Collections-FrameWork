//Program to illustrate HashMap put(key, value) method 
// Return Value: If an existing key is passed then the previous value gets returned. 
//If a new pair is passed, then NULL is returned.
package HashMap;

import java.util.HashMap;

public class PutMethod {

    public static void main(String[] args) {
        HashMap<String, Integer> hash_map1 = new HashMap<>();

        hash_map1.put("Vishal", 1703199);
        hash_map1.put("Vaibhav", 1703189);
        hash_map1.put("Sushil", 1703176);
        hash_map1.put("Gourav", 1702637);

        System.out.println("Created HashMap1 Is: " + hash_map1);

        HashMap<Integer, String> hash_map2 = new HashMap<>();

        hash_map2.put(1, "Program");
        hash_map2.put(2, "To");
        hash_map2.put(3, "Put()");
        hash_map2.put(4, "Method");

        System.out.println("Created HashMap2 Is: " + hash_map2);

        String return_value = (String) hash_map2.put(2, "For");

        System.out.println("HashMap2 after change: " + hash_map2);
        System.out.println("Returned Value: " + return_value);
    }
}
