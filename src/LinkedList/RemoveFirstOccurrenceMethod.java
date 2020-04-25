//Program to illustrate LinkedList removeFirstOccurrence(Object element) method 
package LinkedList;

import java.util.LinkedList;

public class RemoveFirstOccurrenceMethod {

    public static void main(String[] args) {
        LinkedList<Integer> linked_list = new LinkedList<>();

        linked_list.add(12);
        linked_list.add(13);
        linked_list.add(12);
        linked_list.add(14);
        linked_list.add(15);
        linked_list.add(16);
        
        System.out.println("LinkedList Created Is: "+linked_list);
        
        linked_list.removeFirstOccurrence(12);
        
        System.out.println("LinkedList After removeFirstOccurrence Operation: "+linked_list);
    }
}
