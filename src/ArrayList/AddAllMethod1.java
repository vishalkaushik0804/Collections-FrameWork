//Program to illustrate Arraylist addAll(Collection c) method 
package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class AddAllMethod1 {

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
        array_list2.add(0);
        array_list2.addAll(array_list1);
        array_list2.add(6);

        System.out.println("Created ArrayList2 Is: ");
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
