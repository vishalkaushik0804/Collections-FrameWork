//Program to illustrate TreeSet iterator() method 
package TreeSet;

import java.util.TreeSet;
import java.util.Iterator;

public class IteratorMethod {

    public static void main(String[] args) {
        TreeSet<Integer> tree_set = new TreeSet<>();

        tree_set.add(10);
        tree_set.add(8);
        tree_set.add(6);
        tree_set.add(4);
        tree_set.add(2);

        System.out.println("Created TreeSet Is: " + tree_set);

        System.out.println("Displaying TreeSet using Iterator method: ");

        Iterator itr = tree_set.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
            if (itr.hasNext() == false) {
                System.out.println("");
            }
        }

    }

}
