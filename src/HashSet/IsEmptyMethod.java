//Program to illustrate HashSet isEmpty() method 
package HashSet;

import java.util.HashSet;

public class IsEmptyMethod {

    public static void main(String[] args) {
        HashSet<Integer> hash_set = new HashSet<>();

        hash_set.add(12);
        hash_set.add(13);
        hash_set.add(14);
        hash_set.add(15);
        hash_set.add(16);

        System.out.println("Created HashSet Is: " + hash_set);
        
        System.out.println("Is The HashSet Empty? " + hash_set.isEmpty());

        hash_set.clear();

        System.out.println("Is The HashSet Empty? " + hash_set.isEmpty());

    }
}
