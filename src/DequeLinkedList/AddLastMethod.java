// Program to illustrate DequeLinkedList addLast(E e) method 
package DequeLinkedList;

import java.util.Deque;
import java.util.LinkedList;

public class AddLastMethod {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.addLast(20);
        deque.addLast(30);
        deque.addLast(40);
        deque.addLast(50);
        deque.addLast(60);

        System.out.println("Created Deque Is: "+deque);
    }
}
