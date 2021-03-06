// Program to illustrate PriorityQueue toArray() method  
package PriorityQueue;

import java.util.PriorityQueue;

public class ToArrayMethod1 {

    public static void main(String[] args) {
        PriorityQueue<Integer> priority_queue = new PriorityQueue<>();

        priority_queue.add(121);
        priority_queue.add(122);
        priority_queue.add(123);
        priority_queue.add(124);
        priority_queue.add(125);

        System.out.println("Created PriorityQueue Is: " + priority_queue);

        Object[] priority_queue_array;

        priority_queue_array = priority_queue.toArray();
        
        System.out.println("Converted PriorityQueue to an Array is: ");
        for(Object obj : priority_queue_array){
            System.out.println(obj);
        }
    }
}
