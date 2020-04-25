// Program to illustrate DequeLinkedList iterator() method 
package DequeLinkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Iterator;

public class IteratorMethod {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.add(50);

        System.out.println("Created Deque Is: " + deque);

        System.out.println("Traversing Deque using DescendingIterator Method: ");

        Iterator iterator = deque.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
