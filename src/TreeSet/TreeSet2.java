//Program to illustrate Introduction to TreeSet in Collection
package TreeSet;

import java.util.TreeSet;

public class TreeSet2 {

    public static void main(String[] args) {
        TreeSet<Integer> tree_set = new TreeSet<>();

        try {
            tree_set.add(10);
            tree_set.add(40);
            tree_set.add(null);

            System.out.println("Created TreeSet Is: " + tree_set);
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e);
        }

    }
}
