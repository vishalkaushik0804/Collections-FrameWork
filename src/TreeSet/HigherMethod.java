//Program to illustrate TreeSet higher(E ele) method 
package TreeSet;

import java.util.TreeSet;

public class HigherMethod {

    public static void main(String[] args) {
        TreeSet<Integer> tree_set = new TreeSet<>();

        tree_set.add(12);
        tree_set.add(14);
        tree_set.add(16);
        tree_set.add(18);
        tree_set.add(20);

        System.out.println("Created TreeSet Is: " + tree_set);

        System.out.println("Element higher than '17' in TreeSet is: "+tree_set.higher(17));

    }
}
