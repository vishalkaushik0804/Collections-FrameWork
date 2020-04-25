//Program to illustrate TreeSet containsAll(Collection C) method 
package TreeSet;

import java.util.TreeSet;

public class ContainsAllMethod {

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
        tree_set2.add(14);
        tree_set2.add(12);

        System.out.println("Created TreeSet Second Is: " + tree_set2);

       
        System.out.println("Does TreeSet First contains TreeSet Second? " + tree_set1.containsAll(tree_set2));

    }
}
