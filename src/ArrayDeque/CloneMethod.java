// Program to illustrate ArrayDeque clone() method 
package ArrayDeque;

import java.util.Deque;
import java.util.ArrayDeque;

public class CloneMethod {

    public static void main(String[] args) {
        ArrayDeque<Integer> array_deque = new ArrayDeque<>();

        array_deque.add(10);
        array_deque.add(20);
        array_deque.add(30);
        array_deque.add(40);
        array_deque.add(50);

        System.out.println("Created ArrayDeque Is: " + array_deque);

        Deque<Integer> clone_deque = array_deque.clone();

        System.out.println("CloneDeque of  ArrayDeque is: " + clone_deque);

    }

}
