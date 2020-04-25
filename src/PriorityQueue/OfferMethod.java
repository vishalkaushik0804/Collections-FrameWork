// Program to illustrate PriorityQueue offer(Object element) method 
package PriorityQueue;

import java.util.PriorityQueue;

public class OfferMethod {

    public static void main(String[] args) {
        PriorityQueue<Integer> priority_queue = new PriorityQueue<>();

        priority_queue.add(1000);
        priority_queue.add(2000);
        priority_queue.add(3000);
        priority_queue.add(1500);
        priority_queue.add(1600);

        System.out.println("Created PriorityQueue Is: " + priority_queue);

        priority_queue.offer(100);
        priority_queue.offer(200);
        priority_queue.offer(300);

        System.out.println("PriorityQueue after Offer method: " + priority_queue);

    }
}
