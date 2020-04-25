//Program to illustrate TreeSet headSet(Object element) method 
package TreeSet;

import java.util.TreeSet;
import java.util.Iterator;

public class HeadSetMethod {

    public static void main(String[] args) {
        TreeSet<Integer> tree_set = new TreeSet<>();

        tree_set.add(30);
        tree_set.add(25);
        tree_set.add(20);
        tree_set.add(15);
        tree_set.add(10);

        System.out.println("Created TreeSet Is: " + tree_set);

        TreeSet<Integer> head_set;
        head_set = (TreeSet<Integer>) tree_set.headSet(30);

        Iterator itr = head_set.iterator();

        System.out.println("Traversing the TreeSet using HeadSet: ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
            if (itr.hasNext() == false) {
                System.out.println("");
            }
        }

    }
}
