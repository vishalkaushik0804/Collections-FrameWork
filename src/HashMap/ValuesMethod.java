//Program to illustrate HashMap values() method
package HashMap;

import java.util.HashMap;

public class ValuesMethod {

    public static void main(String[] args) {
        HashMap<Integer, String> hash_map = new HashMap<>();

        hash_map.put(10, "Program");
        hash_map.put(20, "For");
        hash_map.put(30, "Values");
        hash_map.put(40, "Method");

        System.out.println("Created HashMap Is: " + hash_map);

        System.out.println("Collection view of HashMap: " + hash_map.values());
    }
}
