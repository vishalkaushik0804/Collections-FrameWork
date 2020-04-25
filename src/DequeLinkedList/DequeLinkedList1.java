// Program to illustrate Introduction to Deque-LinkedList
package DequeLinkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Iterator;

public class DequeLinkedList1 {

    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        deque.add("Simple Add Function");
        deque.addFirst("Introduction to Deque-LinkedList");
        deque.addLast("AddLast Function");

        deque.push("Push Function");
        deque.offer("Offer Function");
        deque.offerFirst("offerFirst Function");
        deque.offerLast("OfferLast Function");

        System.out.println("Created Deque Is: " + deque);

        System.out.println("\nFirst element of the Deque: " + deque.getFirst());

        System.out.println("Peek value of the Deque: " + deque.peek());

        System.out.println("\nDeque Forward Traversal Using Iterator Method: ");
        Iterator forward_iterator = deque.iterator();
        while (forward_iterator.hasNext()) {
            System.out.println(forward_iterator.next());
        }
        System.out.println("");

        System.out.println("Deque Reverse Traversal Using Iterator Method: ");
        Iterator reverse_iterator = deque.descendingIterator();
        while (reverse_iterator.hasNext()) {
            System.out.println(reverse_iterator.next());
        }

        deque.remove();
        System.out.println("Deque after Remove Operation: " + deque);
    }

}
