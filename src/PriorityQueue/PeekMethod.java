// Program to illustrate PriorityQueue peek() method 
package PriorityQueue;

import java.util.PriorityQueue;

public class PeekMethod {

    public static void main(String[] args) {
        PriorityQueue<Integer> priority_queue = new PriorityQueue<>();

        priority_queue.add(12);
        priority_queue.add(13);
        priority_queue.add(14);
        priority_queue.add(15);
        priority_queue.add(16);

        System.out.println("Created PriorityQueue Is: " + priority_queue);

        System.out.println("Peek value of the PriorityQueue is: " + priority_queue.peek());
    }
}
