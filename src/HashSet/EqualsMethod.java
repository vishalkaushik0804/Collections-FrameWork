//Program to illustrate HashSet equals(Object o) method 
package HashSet;

import java.util.HashSet;

public class EqualsMethod {

    public static void main(String[] args) {
        HashSet<Integer> hash_set1 = new HashSet<>();

        hash_set1.add(12);
        hash_set1.add(13);
        hash_set1.add(14);
        hash_set1.add(15);
        hash_set1.add(16);

        System.out.println("Created HashSet First Is: " + hash_set1);

        HashSet<Integer> hash_set2 = new HashSet<>();

        hash_set2.add(12);
        hash_set2.add(13);
        hash_set2.add(14);
        hash_set2.add(15);
        hash_set2.add(16);

        System.out.println("Created HashSet Second Is: " + hash_set2);

        boolean value = hash_set1.equals(hash_set2);

        System.out.println("Are both HashSet equal? " + value);
    }
}
