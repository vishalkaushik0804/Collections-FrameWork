//Program to illustrate Arraylist listIterator() method
package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorMethod1 {

    public static void main(String[] args) {
        ArrayList<Integer> array_list = new ArrayList<>();
        array_list.add(1);
        array_list.add(2);
        array_list.add(3);
        array_list.add(4);
        array_list.add(5);

        ListIterator<Integer> itr = array_list.listIterator();
        System.out.println("Using ListIterator, values of ArrayList are: ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
            if (itr.hasNext() == false) {
                System.out.println("");
            }
        }
    }
}
