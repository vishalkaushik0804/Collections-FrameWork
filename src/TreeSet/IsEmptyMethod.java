//Program to illustrate TreeSet isEmpty() method 
package TreeSet;

import java.util.TreeSet;

public class IsEmptyMethod {

    public static void main(String[] args) {
        TreeSet<Integer>tree_set = new TreeSet<>();
        
        tree_set.add(20);
        tree_set.add(15);
        tree_set.add(10);
        tree_set.add(5);
        tree_set.add(0);
 
        System.out.println("Created TreeSet Is: "+tree_set);
        
        System.out.println("Is TreeSet Empty? "+ tree_set.isEmpty());
        
        tree_set.clear();
        
        System.out.println("After Clear Operation: ");
        System.out.println("Is TreeSet Empty Now? "+tree_set.isEmpty());
    }
}
