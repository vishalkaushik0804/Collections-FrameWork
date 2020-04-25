//Program to illustrate TreeSet toString() method 
package TreeSet;

import java.util.TreeSet;

public class ToStringMethod {

    public static void main(String[] args) {
        TreeSet<Integer> tree_set = new TreeSet<>();

        tree_set.add(20);
        tree_set.add(18);
        tree_set.add(16);
        tree_set.add(14);
        tree_set.add(12);

        System.out.println("Created TreeSet Is: " + tree_set);

        String string_tree_set = tree_set.toString();

        System.out.println("Converted TreeSet into String is: "+string_tree_set);
    }
}
