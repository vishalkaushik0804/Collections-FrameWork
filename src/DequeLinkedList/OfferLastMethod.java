// Program to illustrate DequeLinkedList  offerLast(E e) method 
package DequeLinkedList;

import java.util.Deque;
import java.util.LinkedList;

public class OfferLastMethod {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.add(21);
        deque.add(22);
        deque.add(23);
        deque.add(24);
        deque.add(25);

        System.out.println("Created Deque Is: " + deque);

        deque.offerLast(26);

        System.out.println("Deque after OfferLast method: " + deque);
    }
}
