// Program to illustrate ArrayDeque pollFirst() method 
package ArrayDeque;

import java.util.Deque;
import java.util.ArrayDeque;

public class PollFirstMethod {

    public static void main(String[] args) {
        Deque<Integer> array_deque = new ArrayDeque<>();

        array_deque.add(10);
        array_deque.add(20);
        array_deque.add(30);
        array_deque.add(40);
        array_deque.add(50);

        System.out.println("Created ArrayDeque Is: " + array_deque);

        System.out.println("Head of the ArrayDeque using PollFirst method Is: " + array_deque.pollFirst());

        System.out.println("ArrayDeque after PollFirst operation: " + array_deque);

    }
}
