// Program to illustrate HashSet remove(Object O) method 
package HashSet;

import java.util.HashSet;

public class RemoveMethod {

    public static void main(String[] args) {
        HashSet<Integer> hash_set = new HashSet<>();

        hash_set.add(10);
        hash_set.add(20);
        hash_set.add(30);
        hash_set.add(40);
        hash_set.add(50);
        

        System.out.println("Created HashSet Is: " + hash_set);

        hash_set.remove(50);
        hash_set.remove(20);

        System.out.println("HashSet after Remove Operation is: " + hash_set);
    }
}
