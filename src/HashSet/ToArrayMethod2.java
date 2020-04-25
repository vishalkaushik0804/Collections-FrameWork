//Program to illustrate HashSet toArray(T[] a) method 
package HashSet;

import java.util.HashSet;

public class ToArrayMethod2 {

    public static void main(String[] args) {
        HashSet<Integer> hash_set = new HashSet<>();

        hash_set.add(12);
        hash_set.add(13);
        hash_set.add(14);
        hash_set.add(15);
        hash_set.add(16);

        System.out.println("Created HashSet First Is: " + hash_set);

        Integer[] hash_set_array = new Integer[hash_set.size()];
        hash_set_array = hash_set.toArray(hash_set_array);

        System.out.println("Created Array From HashSet Is: ");
        for (Object obj : hash_set_array) {
            System.out.println(obj);
        }
    }
}
