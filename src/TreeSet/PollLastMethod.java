//Program to illustrate TreeSet pollLast() method 
package TreeSet;

import java.util.TreeSet;

public class PollLastMethod {

    public static void main(String[] args) {
        TreeSet<Integer> tree_set = new TreeSet<>();

        tree_set.add(20);
        tree_set.add(19);
        tree_set.add(18);
        tree_set.add(17);
        tree_set.add(16);

        System.out.println("Created TreeSet Is: " + tree_set);

        System.out.println("Last element of the TreeSet is: " + tree_set.pollLast());

        System.out.println("TreeSet after PollLast operation: " + tree_set);
    }
}
