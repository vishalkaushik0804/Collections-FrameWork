//Program to illustrate LinkedList removeFirst() method 
package DequeLinkedList;

import java.util.Deque;
import java.util.LinkedList;

public class RemoveFirstMethod {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.add(0);
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);

        System.out.println("Created Deque Is: " + deque);

        deque.removeFirst();

        System.out.println("Deque after removeFirst operation: " + deque);
    }
}
