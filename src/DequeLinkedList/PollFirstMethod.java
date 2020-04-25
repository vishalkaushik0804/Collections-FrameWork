// Program to illustrate DequeLinkedList pollFirst() method 
package DequeLinkedList;

import java.util.Deque;
import java.util.LinkedList;

public class PollFirstMethod {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.add(12);
        deque.add(24);
        deque.add(36);
        deque.add(48);
        deque.add(60);

        System.out.println("Created Deque Is: " + deque);

        System.out.println("PollFirst Value of the Deque is: " + deque.pollFirst());

        System.out.println("Deque after poll operation: " + deque);

    }
}
