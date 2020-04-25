//Program to illustrate HashMap clear() method
package HashMap;

import java.util.HashMap;

public class ClearMethod {

    public static void main(String[] args) {
        HashMap<Integer, String> hash_map = new HashMap<>();

        hash_map.put(1, "Program");
        hash_map.put(2, "For");
        hash_map.put(3, "Clear");
        hash_map.put(4, "Method");

        System.out.println("Created HashMap Is: " + hash_map);

        hash_map.clear();

        System.out.println("HashMap after Clear operation: " + hash_map);
    }
}
