// Program to illustrate PriorityQueue poll() method 
package PriorityQueue;

import java.util.PriorityQueue;

public class PollMethod {

    public static void main(String[] args) {
        PriorityQueue<Integer> priority_queue = new PriorityQueue<>();

        priority_queue.add(2);
        priority_queue.add(4);
        priority_queue.add(6);
        priority_queue.add(8);
        priority_queue.add(10);

        System.out.println("Created PriorityQueue Is: " + priority_queue);

        Integer polled_value = priority_queue.poll();

        System.out.println("Polled Value of PriorityQueue: " + polled_value);

        System.out.println("PriorityQueue after Poll operation: " + priority_queue);
    }

}
