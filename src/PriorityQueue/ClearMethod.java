// Program to illustrate PriorityQueue clear() method 
package PriorityQueue;

import java.util.PriorityQueue;

public class ClearMethod {

    public static void main(String[] args) {
        PriorityQueue<Integer> priority_queue = new PriorityQueue<>();

        priority_queue.add(10);
        priority_queue.add(20);
        priority_queue.add(30);
        priority_queue.add(40);
        priority_queue.add(50);

        System.out.println("Created PriorityQueue Is: " + priority_queue);

        priority_queue.clear();

        System.out.println("PriorityQueue after Clear operation: " + priority_queue);
    }
}
