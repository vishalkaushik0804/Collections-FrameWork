// Program to illustrate PriorityQueue contains(Object element) method 
package PriorityQueue;

import java.util.PriorityQueue;

public class ContainsMethod {

    public static void main(String[] args) {
        PriorityQueue<Integer> priority_queue = new PriorityQueue<>();

        priority_queue.add(10);
        priority_queue.add(20);
        priority_queue.add(30);
        priority_queue.add(40);
        priority_queue.add(50);

        System.out.println("Created PriorityQueue Is: " + priority_queue);

        System.out.println("Does PriorityQueue contains '50' ? " + priority_queue.contains(50));
    }
}
