// Program to illustrate Introduction to HashMap
package HashMap;

import java.util.HashMap;

public class HashMap1 {

    public static void main(String[] args) {
        HashMap<String, Integer> hash_map = new HashMap<>();

        hash_map.put("Rahul", 10);
        hash_map.put("Vishal", 8);
        hash_map.put("Ayush", 8);

        System.out.println("Created HashMap Is: "+hash_map);

        System.out.println("Is HashMap Empty? "+hash_map.isEmpty());
        
    }
}
