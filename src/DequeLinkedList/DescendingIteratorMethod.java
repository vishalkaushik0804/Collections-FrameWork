// Program to illustrate DequeLinkedList descendingIterator() method 
package DequeLinkedList;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DescendingIteratorMethod {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.add(50);

        System.out.println("Created Deque Is: " + deque);

        System.out.println("Traversing Deque using DescendingIterator Method: ");

        Iterator reverse_iterator = deque.descendingIterator();
        while (reverse_iterator.hasNext()) {
            System.out.println(reverse_iterator.next());
        }

    }
}
