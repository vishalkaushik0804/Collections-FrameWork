//Program to illustrate HashSet toString() method 
package HashSet;

import java.util.HashSet;

public class ToStringMethod {

    public static void main(String[] args) {
        HashSet<Integer> hash_set = new HashSet<>();

        hash_set.add(12);
        hash_set.add(13);
        hash_set.add(14);
        hash_set.add(15);
        hash_set.add(16);

        System.out.println("Created HashSet First Is: " + hash_set);

        String hash_set_string = hash_set.toString();

        System.out.println("Created String From HashSet Is: "+hash_set_string);
        
    }
}
