//Program to illustrate LinkedList removeFirstOccurrence(Object element) method 
package DequeLinkedList;

import java.util.LinkedList;

public class RemoveFirstOccurrenceMethod {

    public static void main(String[] args) {
        LinkedList<Integer> deque = new LinkedList<>();

        deque.add(12);
        deque.add(13);
        deque.add(12);
        deque.add(14);
        deque.add(15);
        deque.add(16);

        System.out.println("Deque Created Is: " + deque);

        deque.removeFirstOccurrence(12);

        System.out.println("Deque After removeFirstOccurrence Operation: " + deque);
    }
}
