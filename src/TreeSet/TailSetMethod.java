//Program to illustrate TreeSet tailSet(Object element) method 
package TreeSet;

import java.util.TreeSet;
import java.util.Iterator;

public class TailSetMethod {

    public static void main(String[] args) {
        TreeSet<Integer> tree_set = new TreeSet<>();

        tree_set.add(30);
        tree_set.add(25);
        tree_set.add(20);
        tree_set.add(15);
        tree_set.add(10);

        System.out.println("Created TreeSet Is: " + tree_set);

        TreeSet<Integer> tail_set;
        tail_set = (TreeSet<Integer>) tree_set.tailSet(15);

        Iterator itr = tail_set.iterator();

        System.out.println("Traversing the TreeSet using TailSet: ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
            if (itr.hasNext() == false) {
                System.out.println("");
            }
        }

    }
}
