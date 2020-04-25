// Program to illustrate ArrayDeque removeFirst() method 
package ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveFirstMethod {

    public static void main(String[] args) {
        Deque<Integer> array_deque = new ArrayDeque<>();

        array_deque.add(10);
        array_deque.add(20);
        array_deque.add(30);
        array_deque.add(40);
        array_deque.add(50);

        System.out.println("Created ArrayDeque Is: "+array_deque);
        
        array_deque.removeFirst();
        
        System.out.println("ArrayDeque after RemoveFirst operation: "+array_deque);
    }

}
