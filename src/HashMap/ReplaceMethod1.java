//Program to illustrate HashMap replace(K key, V value) method
package HashMap;

import java.util.HashMap;

public class ReplaceMethod1 {

    public static void main(String[] args) {
        HashMap<Integer, String> hash_map = new HashMap<>();

        hash_map.put(12, "Program");
        hash_map.put(13, "To");
        hash_map.put(14, "Demonstrate");
        hash_map.put(15, "Replace");
        hash_map.put(16, "Method");

        System.out.println("Created HashMap Is: " + hash_map);

        String replace_value1 = hash_map.replace(13, "For");
        String replace_value2 = hash_map.replace(14, "Demonstrating");

        System.out.println("HashMap after Replace operation: " + hash_map);

        System.out.println("Replaced Value1 Is: " + replace_value1);
        System.out.println("Replaced Value2 Is: " + replace_value2);
    }
}
