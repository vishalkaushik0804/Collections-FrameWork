// Program to illustrate ArrayDeque toArray(arr[]) method 
package ArrayDeque;

import java.util.Deque;
import java.util.ArrayDeque;

public class ToArrayMethod2 {

    public static void main(String[] args) {
        Deque<Integer> array_deque = new ArrayDeque<>();

        array_deque.add(10);
        array_deque.add(20);
        array_deque.add(30);
        array_deque.add(40);
        array_deque.add(50);

        System.out.println("Created ArrayDeque Is: " + array_deque);

        Integer[] converted_array  = new Integer[array_deque.size()];
        converted_array = array_deque.toArray(converted_array);

        System.out.println("Created Array using toArray method: ");
        for (Integer obj : converted_array) {
            System.out.println(obj);
        }

    }

}
