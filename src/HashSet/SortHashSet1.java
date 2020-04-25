//Program to illustrate how to sort HashSet by Converting HashSet to List.
package HashSet;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class SortHashSet1 {

    public static void main(String[] args) {
        HashSet<Integer> hash_set = new HashSet<>();

        hash_set.add(12);
        hash_set.add(13);
        hash_set.add(14);
        hash_set.add(15);
        hash_set.add(16);

        System.out.println("Created HashSet Is: " + hash_set);

        ArrayList<Integer> array_list = new ArrayList<>(hash_set);
        Collections.sort(array_list);

        System.out.println("Sorted HashSet Is: " + array_list);

    }
}
