//Program to illustrate TreeSet clear() method 
package TreeSet;

import java.util.TreeSet;

public class ClearMethod {

    public static void main(String[] args) {
        TreeSet<Integer> tree_set1 = new TreeSet<>();

        tree_set1.add(20);
        tree_set1.add(18);
        tree_set1.add(16);
        tree_set1.add(14);
        tree_set1.add(12);

        System.out.println("Created TreeSet First Is: " + tree_set1);

        tree_set1.clear();

        System.out.println("TreeSet after Clear operation is: " + tree_set1);

    }
}
