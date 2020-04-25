// Program to illustrate DequeLinkedList  getFirst() method 
package DequeLinkedList;

import java.util.Deque;
import java.util.LinkedList;

public class GetFirstMethod {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.add(21);
        deque.add(22);
        deque.add(23);
        deque.add(24);
        deque.add(25);

        System.out.println("Created Deque Is: " + deque);

        System.out.println("First element of the Deque is: " + deque.getFirst());
    }
}
