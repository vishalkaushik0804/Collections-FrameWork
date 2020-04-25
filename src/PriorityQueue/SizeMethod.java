// Program to illustrate PriorityQueue size() method 
package PriorityQueue;

import java.util.PriorityQueue;

public class SizeMethod {

    public static void main(String[] args) {
        PriorityQueue<Integer> priority_queue = new PriorityQueue<>();

        priority_queue.add(100);
        priority_queue.add(200);
        priority_queue.add(300);
        priority_queue.add(400);
        priority_queue.add(500);

        System.out.println("Created PriorityQueue Is: " + priority_queue);

        System.out.println("Size of the PriorityQueue is: " + priority_queue.size());
    }
}
