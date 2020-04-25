// Program to illustrate ArrayDeque getLast() method 
package ArrayDeque;

import java.util.Deque;
import java.util.ArrayDeque;

public class GetLastMethod {

    public static void main(String[] args) {
        Deque<Integer> array_deque = new ArrayDeque<>();

        array_deque.add(10);
        array_deque.add(20);
        array_deque.add(30);
        array_deque.add(40);
        array_deque.add(50);

        System.out.println("Created ArrayDeque Is: " + array_deque);

        System.out.println("Last element of the ArrayDeque using GetLast method Is: " + array_deque.getLast());

    }
}
