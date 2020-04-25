//Program to illustrate TreeSet pollFirst() method 
package TreeSet;

import java.util.TreeSet;

public class PollFirstMethod {

    public static void main(String[] args) {
        TreeSet<Integer> tree_set = new TreeSet<>();

        tree_set.add(24);
        tree_set.add(20);
        tree_set.add(16);
        tree_set.add(12);
        tree_set.add(8);

        System.out.println("Created TreeSet Is: " + tree_set);

        System.out.println("First element in the TreeSet is: " + tree_set.pollFirst());

        System.out.println("TreeSet after PollFirst operation: " + tree_set);
    }
}
