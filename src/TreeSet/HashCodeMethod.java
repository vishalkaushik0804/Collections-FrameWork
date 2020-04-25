//Program to illustrate TreeSet hashCode() method 
package TreeSet;

import java.util.TreeSet;

public class HashCodeMethod {

    public static void main(String[] args) {
        TreeSet<Integer> tree_set = new TreeSet<>();

        tree_set.add(13);
        tree_set.add(14);
        tree_set.add(15);
        tree_set.add(16);
        tree_set.add(17);

        System.out.println("Created TreeSet Is: " + tree_set);

        System.out.println("HashCode Value of TreeSet Is: " + tree_set.hashCode());

    }
}
