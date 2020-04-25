//Program to illustrate LinkedList removeLastOccurrence(Object element) method 
package LinkedList;

import java.util.LinkedList;

public class RemoveLastOccurrenceMethod {

    public static void main(String[] args) {
        LinkedList<Integer> linked_list = new LinkedList<>();

        linked_list.add(12);
        linked_list.add(13);
        linked_list.add(12);
        linked_list.add(14);
        linked_list.add(15);
        linked_list.add(12);

        System.out.println("LinkedList Created Is: " + linked_list);

        linked_list.removeLastOccurrence(12);

        System.out.println("LinkedList After removeLastOccurrence Operation: " + linked_list);
    }
}
