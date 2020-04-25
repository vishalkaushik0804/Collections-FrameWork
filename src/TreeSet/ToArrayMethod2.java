//Program to illustrate TreeSet toArray(T[] a) method 
package TreeSet;

import java.util.TreeSet;

public class ToArrayMethod2 {

    public static void main(String[] args) {
        TreeSet<Integer> tree_set = new TreeSet<>();

        tree_set.add(20);
        tree_set.add(18);
        tree_set.add(16);
        tree_set.add(14);
        tree_set.add(12);

        System.out.println("Created TreeSet Is: " + tree_set);

        Integer[] tree_set_array = new Integer[tree_set.size()];
        tree_set_array = tree_set.toArray(tree_set_array);

        for (Integer value : tree_set_array) {
            System.out.println(value);
        }
    }
}
