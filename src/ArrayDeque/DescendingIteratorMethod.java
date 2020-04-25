// Program to illustrate ArrayDeque descendingIterator() method 
package ArrayDeque;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Iterator;

public class DescendingIteratorMethod {

    public static void main(String[] args) {
        Deque<Integer> array_deque = new ArrayDeque<>();

        array_deque.add(10);
        array_deque.add(20);
        array_deque.add(30);
        array_deque.add(40);
        array_deque.add(50);

        System.out.println("Created ArrayDeque Is: " + array_deque);

        System.out.println("ArrayDeque Traversal in Reverse Direction Is: ");

        Iterator iterator = array_deque.descendingIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
            if (iterator.hasNext() == false) {
                System.out.println("");
            }
        }
    }

}
