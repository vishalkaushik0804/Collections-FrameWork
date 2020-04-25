//Program to illustrate TreeSet contains(Object element) method 
package TreeSet;

import java.util.TreeSet;

public class ContainsMethod {

    public static void main(String[] args) {
        TreeSet<Integer> tree_set = new TreeSet<>();

        tree_set.add(18);
        tree_set.add(16);
        tree_set.add(14);
        tree_set.add(12);
        tree_set.add(10);

        System.out.println("Created TreeSet Is: " + tree_set);

        System.out.println("Does the TreeSet contains '18'? "+tree_set.contains(18));

    }
}
