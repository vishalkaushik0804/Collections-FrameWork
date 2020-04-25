// Program to illustrate ArrayDeque push() method 
package ArrayDeque;

import java.util.Deque;
import java.util.ArrayDeque;

public class PushMethod {

    public static void main(String[] args) {
        Deque<Integer> array_deque = new ArrayDeque<>();

        array_deque.add(12);
        array_deque.add(14);
        array_deque.add(16);
        array_deque.add(18);
        array_deque.add(20);

        System.out.println("Created ArrayDeque Is: " + array_deque);

        array_deque.push(10);
        array_deque.push(8);

        System.out.println("ArrayDeque after Push operation: " + array_deque);

    }

}
