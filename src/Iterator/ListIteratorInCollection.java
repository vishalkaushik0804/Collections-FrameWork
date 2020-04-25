// Program to illustrate ListIterator in Collection
//It is only applicable for List collection implemented classes like arraylist, linkedlist etc.
//It provides bi-directional iteration.ListIterator can retrieve the elements in forward and reverse direction also.
package Iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorInCollection {

    public static void main(String[] args) {
        ArrayList<String> collection_list = new ArrayList<>();

        collection_list.add("Program");
        collection_list.add("To");
        collection_list.add("Illustrate");
        collection_list.add("iterator()");
        collection_list.add("Method");

        System.out.println("Abstract Collection1: " + collection_list);

        ListIterator itr = collection_list.listIterator();

        System.out.println("\nThe ListIterator Values in Forward Direction are: ");

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
            if (itr.hasNext() == false) {
                System.out.println("\n");
            }
        }

        System.out.println("The ListIterator Values in Backward Direction are: ");

        while (itr.hasPrevious()) {
            System.out.print(itr.previous() + " ");
            if (itr.hasPrevious() == false) {
                System.out.println("\n");
            }
        }
    }
}
