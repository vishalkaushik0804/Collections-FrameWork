// Program to illustrate PriorityQueue iterator() method 
package PriorityQueue;

import java.util.PriorityQueue;
import java.util.Iterator;

public class IteratorMethod {

    public static void main(String[] args) {
        PriorityQueue<Integer> priority_queue = new PriorityQueue<>();

        priority_queue.add(20);
        priority_queue.add(40);
        priority_queue.add(60);
        priority_queue.add(80);
        priority_queue.add(100);

        System.out.println("Created PriorityQueue using Iterator method is: ");

        Iterator itr = priority_queue.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
            if (itr.hasNext() == false) {
                System.out.println("");
            }
        }
    }
}
