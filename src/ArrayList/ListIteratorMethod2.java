//Program to illustrate Arraylist listIterator(int index) method
package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorMethod2 {

    public static void main(String[] args) {
        ArrayList<Integer> array_list = new ArrayList<>();
        array_list.add(1);
        array_list.add(2);
        array_list.add(3);
        array_list.add(4);
        array_list.add(5);

        System.out.println("Created ArrayList Is: " + array_list);

        ListIterator<Integer> itr = array_list.listIterator(2);
        System.out.println("Using listIterator(index), values of ArrayList starting from index 2 are: ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
            if (itr.hasNext() == false) {
                System.out.println("");
            }
        }
    }
}
