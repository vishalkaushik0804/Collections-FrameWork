//Program to illustrate TreeSet size() method 
package TreeSet;

import java.util.TreeSet;

public class SizeMethod {

    public static void main(String[] args) {
        TreeSet<Integer> tree_set = new TreeSet<>();

        tree_set.add(100);
        tree_set.add(80);
        tree_set.add(70);
        tree_set.add(60);
        tree_set.add(50);

        System.out.println("Created TreeSet Is: " + tree_set);

        System.out.println("Size of the created TreeSet is: " + tree_set.size());
    }
}
