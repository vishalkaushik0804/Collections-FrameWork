// Program to illustrate PriorityQueue add(Object element) method 
package PriorityQueue;

import java.util.PriorityQueue;

public class AddMethod {

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
        priority_queue2.add("Add");
        priority_queue2.add("Method");

        System.out.println("Created PriorityQueue Is: " + priority_queue2);
    }
}
