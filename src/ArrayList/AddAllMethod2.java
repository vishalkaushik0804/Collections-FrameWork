//Program to illustrate Arraylist addAll(int index, Collection c) method 
package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class AddAllMethod2 {

    public static void main(String[] args) {
        ArrayList<Integer> array_list1 = new ArrayList<>();

        array_list1.add(1);
        array_list1.add(2);
        array_list1.add(3);
        array_list1.add(4);
        array_list1.add(5);
        System.out.println("Created ArrayList1 Is: ");
        displayList(array_list1);

        ArrayList<Integer> array_list2 = new ArrayList<>();
        array_list2.add(-1);
        array_list2.add(0);
        array_list2.add(6);
        array_list2.add(7);
        array_list2.add(8);

        System.out.println("Created ArrayList2 Is: ");
        displayList(array_list2);

        System.out.println("ArrayList2 After AddAll() Method: ");
        array_list2.addAll(2, array_list1);
        displayList(array_list2);
    }

    private static void displayList(ArrayList<Integer> list) {
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
            if (itr.hasNext() == false) {
                System.out.println("");
            }
        }
    }
}
