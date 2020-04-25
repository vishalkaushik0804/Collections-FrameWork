// Program to illustrate ArrayDeque remove() method 
package ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveMethod {

    public static void main(String[] args) {
        Deque<Integer> array_deque = new ArrayDeque<>();

        array_deque.add(12);
        array_deque.add(13);
        array_deque.add(14);
        array_deque.add(15);
        array_deque.add(16);

        System.out.println("Created ArrayDeque Is: " + array_deque);

        array_deque.remove();
        array_deque.remove();

        System.out.println("ArrayDeque after Remove operation: " + array_deque);
    }
}
