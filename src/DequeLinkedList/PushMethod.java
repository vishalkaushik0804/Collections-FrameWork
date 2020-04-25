// Program to illustrate DequeLinkedList  push(E element) method 
package DequeLinkedList;

import java.util.Deque;
import java.util.LinkedList;

public class PushMethod {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.add(12);
        deque.add(24);
        deque.add(36);
        deque.add(48);
        deque.add(60);

        System.out.println("Created Deque Is: " + deque);
        
        deque.push(0);
        deque.push(-12);

        System.out.println("Deque after Push operation is: " + deque);

    }
}
