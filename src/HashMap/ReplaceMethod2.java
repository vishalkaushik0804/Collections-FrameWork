//Program to illustrate HashMap replace(K key, V oldValue, V newValue) method
package HashMap;

import java.util.HashMap;

public class ReplaceMethod2 {

    public static void main(String[] args) {
        HashMap<Integer, String> hash_map = new HashMap<>();

        hash_map.put(12, "Program");
        hash_map.put(13, "To");
        hash_map.put(14, "Demonstrate");
        hash_map.put(15, "Replace");
        hash_map.put(16, "Method");
        
        System.out.println("Created HashMap Is: " + hash_map);

        hash_map.replace(13, "To", "For");
        String replace_value = hash_map.replace(14, "Demonstrating");

        System.out.println("HashMap after Replace operation: " + hash_map);

        System.out.println("Replaced Value2 Is: " + replace_value);
    }
}
