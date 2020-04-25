//Program to illustrate HashSet size() method 
package HashSet;

import java.util.HashSet;

public class SizeMethod {

    public static void main(String[] args) {
        HashSet<Integer> hash_set = new HashSet<>();

        hash_set.add(12);
        hash_set.add(13);
        hash_set.add(14);
        hash_set.add(15);
        hash_set.add(16);

        System.out.println("Created HashSet Is: " + hash_set);

        System.out.println("Size of the created HashSet is: "+hash_set.size());
    }
}
