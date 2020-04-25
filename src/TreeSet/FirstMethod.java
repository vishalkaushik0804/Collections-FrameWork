//Program to illustrate TreeSet first() method 
package TreeSet;

import java.util.TreeSet;

public class FirstMethod {

    public static void main(String[] args) {
        TreeSet<Integer> tree_set = new TreeSet<>();

        tree_set.add(8);
        tree_set.add(7);
        tree_set.add(6);
        tree_set.add(5);
        tree_set.add(4);

        System.out.println("Created TreeSet Is: " + tree_set);

        System.out.println("The first element of tree_set is: " + tree_set.first());

    }

}
