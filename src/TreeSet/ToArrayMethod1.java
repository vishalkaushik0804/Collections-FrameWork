//Program to illustrate TreeSet toArray() method 
package TreeSet;

import java.util.TreeSet;

public class ToArrayMethod1 {

    public static void main(String[] args) {
        TreeSet<Integer> tree_set = new TreeSet<>();

        tree_set.add(50);
        tree_set.add(40);
        tree_set.add(30);
        tree_set.add(20);
        tree_set.add(10);

        System.out.println("Created TreeSet Is: " + tree_set);

        Object[] tree_set_array = tree_set.toArray();

        System.out.println("Converted Array for TreeSet is: ");
        for (Object obj : tree_set_array) {
            System.out.print(obj + " ");
        }
        System.out.println("");
    }
}
