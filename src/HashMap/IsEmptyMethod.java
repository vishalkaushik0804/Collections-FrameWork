//Program to illustrate HashMap isEmpty() method
package HashMap;

import java.util.HashMap;

public class IsEmptyMethod {

    public static void main(String[] args) {
        HashMap<String, Integer> hash_map = new HashMap<>();

        hash_map.put("Amazon", 1);
        hash_map.put("Facebook", 2);
        hash_map.put("Samsung", 3);
        hash_map.put("Apple", 4);

        System.out.println("Created HashMap Is: " + hash_map);

        System.out.println("Is HashMap Empty ? " + hash_map.isEmpty());

        hash_map.clear();

        System.out.println("After Clear operation, Is HashMap empty ? " + hash_map.isEmpty());
    }
}
