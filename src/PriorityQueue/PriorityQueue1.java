// Program to illustrate Introduction to PriorityQueue
package PriorityQueue;

import java.util.PriorityQueue;
import java.util.Iterator;

public class PriorityQueue1 {

    public static void main(String[] args) {
        PriorityQueue<Integer> priority_queue1 = new PriorityQueue<>();

        priority_queue1.add(16);
        priority_queue1.add(15);
        priority_queue1.add(14);
        priority_queue1.add(13);
        priority_queue1.add(12);

        System.out.println("Created PriorityQueue Is: " + priority_queue1);

        PriorityQueue<String> priority_queue2 = new PriorityQueue<>();

        priority_queue2.add("Introduction");
        priority_queue2.add("To");
        priority_queue2.add("PriorityQueue");
        priority_queue2.add("In");
        priority_queue2.add("Collection");

        System.out.println("Created PriorityQueue Is: ");

        Iterator itr = priority_queue2.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
