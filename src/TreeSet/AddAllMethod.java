//Program to illustrate TreeSet addAll(Collection c) method 
package TreeSet;

import java.util.TreeSet;
import java.util.Iterator;

public class AddAllMethod {

    public static void main(String[] args) {
        TreeSet<Integer> tree_set1 = new TreeSet<>();

        tree_set1.add(1);
        tree_set1.add(2);
        tree_set1.add(3);
        tree_set1.add(4);
        tree_set1.add(5);
        System.out.println("Created ArrayList1 Is: ");
        displayList(tree_set1);

        TreeSet<Integer> tree_set2 = new TreeSet<>();
        tree_set2.add(0);
        tree_set2.addAll(tree_set1);
        tree_set2.add(6);

        System.out.println("Created ArrayList2 Is: ");
        displayList(tree_set2);

    }

    private static void displayList(TreeSet<Integer> list) {
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
            if (itr.hasNext() == false) {
                System.out.println("");
            }
        }
    }
}
