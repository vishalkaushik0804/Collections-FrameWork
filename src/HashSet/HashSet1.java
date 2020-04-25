//Program to illustrate Introduction to HashSet in Collection
package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

    public static void main(String[] args) {
        HashSet<Integer> hash_set = new HashSet<>();

        hash_set.add(12);
        hash_set.add(13);
        hash_set.add(14);
        hash_set.add(15);
        hash_set.add(16);

        System.out.println("Created HashSet Is: " + hash_set);

        hash_set.remove(12);
        System.out.println("HashSet after Remove operation: " + hash_set);

        System.out.println("Iterating over HashSet: ");
        Iterator itr = hash_set.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
            if (itr.hasNext() == false) {
                System.out.println("");
            }
        }
    }
}
