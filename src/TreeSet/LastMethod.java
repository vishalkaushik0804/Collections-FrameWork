//Program to illustrate TreeSet last() method 
package TreeSet;

import java.util.TreeSet;

public class LastMethod {

    public static void main(String[] args) {
        TreeSet<Integer> tree_set = new TreeSet<>();

        tree_set.add(8);
        tree_set.add(7);
        tree_set.add(6);
        tree_set.add(5);
        tree_set.add(4);

        System.out.println("Created TreeSet Is: " + tree_set);

        System.out.println("The last element of tree_set is: " + tree_set.last());

    }

}
