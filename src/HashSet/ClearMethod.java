//Program to illustrate HashSet clear() method 
package HashSet;

import java.util.HashSet;

public class ClearMethod {

    public static void main(String[] args) {
        HashSet<Integer> hash_set = new HashSet<>();

        hash_set.add(12);
        hash_set.add(13);
        hash_set.add(14);
        hash_set.add(15);
        hash_set.add(16);

        System.out.println("Created HashSet Is: " + hash_set);

        hash_set.clear();

        System.out.println("HashSet after clear operation:  "+hash_set);

    }
}
