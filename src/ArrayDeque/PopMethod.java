// Program to illustrate ArrayDeque pop() method 
package ArrayDeque;

import java.util.Deque;
import java.util.ArrayDeque;

public class PopMethod {

    public static void main(String[] args) {
        Deque<Integer> array_deque = new ArrayDeque<>();

        array_deque.add(12);
        array_deque.add(14);
        array_deque.add(16);
        array_deque.add(18);
        array_deque.add(20);

        System.out.println("Created ArrayDeque Is: " + array_deque);

        array_deque.pop();
        array_deque.pop();

        System.out.println("ArrayDeque after Pop operation: "+array_deque);

    }

}
