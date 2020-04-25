// Program to illustrate PriorityQueue remove(Object element) method 
package PriorityQueue;

import java.util.PriorityQueue;

public class RemoveMethod {

    public static void main(String[] args) {
        PriorityQueue<String> priority_queue = new PriorityQueue<>();

        priority_queue.add("Program");
        priority_queue.add("To");
        priority_queue.add("Illustrate");
        priority_queue.add("Remove");
        priority_queue.add("method");

        System.out.println("Created PriorityQueue Is: "+priority_queue);
        
        priority_queue.remove("Program");
        priority_queue.remove("To");
        
        System.out.println("PriorityQueue after Remove Operation: "+priority_queue);
        
    }
}
