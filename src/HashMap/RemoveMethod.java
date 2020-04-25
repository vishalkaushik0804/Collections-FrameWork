//Program to illustrate HashMap remove(Object key) method 
package HashMap;

import java.util.HashMap;

public class RemoveMethod {

    public static void main(String[] args) {
        HashMap<Integer, String> hash_map = new HashMap<>();

        hash_map.put(12, "This");
        hash_map.put(13, "is");
        hash_map.put(14, "Remove");
        hash_map.put(15, "Method");
        hash_map.put(16, "Program");

        System.out.println("Created HashMap Is: " + hash_map);

        String remove_value = (String) hash_map.remove(16);

        System.out.println("HashMap after Remove operation: " + hash_map);
        System.out.println("Remove Value of HashMap: " + remove_value);
    }
}
