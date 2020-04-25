//Program to illustrate Introduction to TreeSet in Collection
package TreeSet;

import java.util.TreeSet;

public class TreeSet1 {

    public static void main(String[] args) {
        TreeSet<Integer> tree_set = new TreeSet<>();

        tree_set.add(12);
        tree_set.add(14);
        tree_set.add(13);
        tree_set.add(15);
        tree_set.add(16);

        System.out.println("Created TreeSet Is: " + tree_set);
    }

}
