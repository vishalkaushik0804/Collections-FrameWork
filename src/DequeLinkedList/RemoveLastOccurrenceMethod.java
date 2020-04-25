//Program to illustrate LinkedList removeLastOccurrence(Object element) method 
package DequeLinkedList;

import java.util.Deque;
import java.util.LinkedList;

public class RemoveLastOccurrenceMethod {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.add(12);
        deque.add(13);
        deque.add(12);
        deque.add(14);
        deque.add(15);
        deque.add(12);

        System.out.println("Deque Created Is: " + deque);

        deque.removeLastOccurrence(12);

        System.out.println("Deque After removeLastOccurrence Operation: " + deque);
    }
}
