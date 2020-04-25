//Program to illustrate HashSet contains(Object element) method    
package HashSet;

import java.util.HashSet;

public class ContainMethod {

    public static void main(String[] args) {
        HashSet<Integer> hash_set = new HashSet<>();

        hash_set.add(22);
        hash_set.add(33);
        hash_set.add(44);
        hash_set.add(55);
        hash_set.add(66);

        System.out.println("Created HashSet Is: " + hash_set);

        Integer value = 22;

        if (hash_set.contains(value)) {
            System.out.println("HashSet Contains " + value);
        } else {
            System.out.println("HashSet Do Not Contain " + value);
        }

        System.out.println("Does the HashSet contains '33' ? " + hash_set.contains(33));

    }
}
