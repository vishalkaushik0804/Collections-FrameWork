//Program to illustrate HashMap containsValue(Object Value) method
package HashMap;

import java.util.HashMap;

public class ContainsValueMethod {

    public static void main(String[] args) {
        HashMap<Integer, String> hash_map = new HashMap<>();

        hash_map.put(10, "Ten");
        hash_map.put(20, "Twenty");
        hash_map.put(30, "Thirty");
        hash_map.put(40, "Forty");
        hash_map.put(50, "Fifty");

        System.out.println("Created HashMap Is: " + hash_map);

        System.out.println("Does HashMap contain 'Thirty' ? "+hash_map.containsValue("Thirty"));

    }

}
