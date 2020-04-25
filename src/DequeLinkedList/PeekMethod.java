// Program to illustrate DequeLinkedList peek() method 
package DequeLinkedList;

import java.util.Deque;
import java.util.LinkedList;

public class PeekMethod {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.add(12);
        deque.add(24);
        deque.add(36);
        deque.add(48);
        deque.add(60);

        System.out.println("Created Deque Is: " + deque);

        System.out.println("Peek Value of the Deque is: "+deque.peek());

    }
}
