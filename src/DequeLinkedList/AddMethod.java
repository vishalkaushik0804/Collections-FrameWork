// Program to illustrate DequeLinkedList add(add(E e) method 
package DequeLinkedList;

import java.util.Deque;
import java.util.LinkedList;

public class AddMethod {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.add(12);
        deque.add(14);
        deque.add(16);
        deque.add(18);
        deque.add(20);

        System.out.println("Created Deque Is: " + deque);

    }
}
