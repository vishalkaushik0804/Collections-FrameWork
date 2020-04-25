//Program to illustrate TreeSet retainAll(Collection c) method 
package TreeSet;

import java.util.TreeSet;

public class RetainAllMethod {

    public static void main(String[] args) {
        TreeSet<Integer> tree_set1 = new TreeSet<>();

        tree_set1.add(20);
        tree_set1.add(18);
        tree_set1.add(16);
        tree_set1.add(14);
        tree_set1.add(12);

        System.out.println("Created TreeSet First Is: " + tree_set1);

        TreeSet<Integer> tree_set2 = new TreeSet<>();

        tree_set2.add(20);
        tree_set2.add(18);
        tree_set2.add(16);

        System.out.println("Created TreeSet Second Is: " + tree_set2);

        tree_set1.retainAll(tree_set2);

        System.out.println("TreeSet First after RetainAll operation: " + tree_set1);

    }
}
