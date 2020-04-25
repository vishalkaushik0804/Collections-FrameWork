//Program to illustrate TreeSet remove(Object O) method 
package TreeSet;

import java.util.TreeSet;

public class RemoveMethod {

    public static void main(String[] args) {
        TreeSet<Integer> tree_set = new TreeSet<>();

        tree_set.add(100);
        tree_set.add(80);
        tree_set.add(60);
        tree_set.add(40);
        tree_set.add(20);

        System.out.println("Created TreeSet Is: " + tree_set);

        tree_set.remove(100);

        System.out.println("TreeSet after Remove operation: " + tree_set);
    }
}
