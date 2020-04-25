//Program to illustrate how to sort HashSet by Converting HashSet to List.
package HashSet;

import java.util.HashSet;
import java.util.TreeSet;

public class SortHashSet2 {

    public static void main(String[] args) {
        HashSet<Integer> hash_set = new HashSet<>();

        hash_set.add(12);
        hash_set.add(13);
        hash_set.add(14);
        hash_set.add(15);
        hash_set.add(16);

        System.out.println("Created HashSet Is: " + hash_set);

        TreeSet<Integer> tree_set = new TreeSet<>(hash_set);

        System.out.println("Sorted HashSet Is: " + tree_set);

    }
}
