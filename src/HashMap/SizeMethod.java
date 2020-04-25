//Program to illustrate HashMap size() method 
package HashMap;

import java.util.HashMap;

public class SizeMethod {

    public static void main(String[] args) {
        HashMap<Integer, String> hash_map = new HashMap<>();

        hash_map.put(10, "Program");
        hash_map.put(11, "For");
        hash_map.put(12, "Size");
        hash_map.put(13, "Method");

        System.out.println("Created HashMap Is: "+hash_map); 
        
        System.out.println("Size of the HashMap is: "+hash_map.size());
    }
}
