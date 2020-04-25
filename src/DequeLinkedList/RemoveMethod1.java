// Program to illustrate DequeLinkedList remove() method 
package DequeLinkedList;

import java.util.Deque;
import java.util.LinkedList;

public class RemoveMethod1 {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.add(12);
        deque.add(13);
        deque.add(14);
        deque.add(15);
        deque.add(16);

        System.out.println("Created Deque Is: " + deque);

        deque.remove();

        System.out.println("Deque after remove operation: " + deque);
    }
}
