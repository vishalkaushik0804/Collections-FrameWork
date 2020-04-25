//Program to illustrate LinkedList addLast(Object element) method 
package LinkedList;

import java.util.LinkedList;
import java.util.Iterator;

public class AddLastMethod {

    public static void main(String[] args) {
        LinkedList<Integer> linked_list = new LinkedList<>();

        linked_list.add(1);
        linked_list.add(2);
        linked_list.add(3);
        linked_list.add(4);
        linked_list.add(5);

        System.out.println("Created LinkedList Is: ");
        displayList(linked_list);

        linked_list.addLast(6);
        System.out.println("LinkedList after 1st addLast operation: ");
        displayList(linked_list);

        linked_list.addLast(7);
        System.out.println("LinkedList after 2nd addLast operation: ");
        displayList(linked_list);

    }

    private static void displayList(LinkedList<Integer> linked_list) {
        Iterator itr = linked_list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
            if (itr.hasNext() == false) {
                System.out.println("");
            }
        }
    }
}
