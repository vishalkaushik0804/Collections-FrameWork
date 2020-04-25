// Program to illustrate DequeLinkedList addFirst(E e) method 
package DequeLinkedList;

import java.util.Deque;
import java.util.LinkedList;

public class AddFirstMethod {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(10);
        deque.addFirst(8);
        deque.addFirst(6);
        deque.addFirst(4);
        deque.addFirst(2);

        System.out.println("Created Deque Is: "+deque);
    }
}
