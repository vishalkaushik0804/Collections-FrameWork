// Program to illustrate Arraylist  add(int index, Object element) method 
package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class AddMethod2 {

    public static void main(String[] args) {
        ArrayList<Integer> array_list = new ArrayList<>();

        array_list.add(12);
        array_list.add(13);
        array_list.add(14);
        array_list.add(16);
        System.out.println("ArrayList before using  add(int index, Object element) Method: ");
        displayList(array_list);

        array_list.add(3, 15);

        System.out.println("ArrayList after using  add(int index, Object element) Method: ");
        displayList(array_list);

    }

    private static void displayList(ArrayList<Integer> array_list) {
        Iterator iterator_over_list = array_list.iterator();
        while (iterator_over_list.hasNext()) {
            System.out.print(iterator_over_list.next() + " ");
            if (iterator_over_list.hasNext() == false) {
                System.out.println("");
            }
        }
    }
}
