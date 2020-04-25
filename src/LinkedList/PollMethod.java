//Program to illustrate LinkedList poll() method 
package LinkedList;

import java.util.LinkedList;

public class PollMethod {

    public static void main(String[] args) {
        LinkedList<Integer> linked_list = new LinkedList<>();

        linked_list.add(12);
        linked_list.add(14);
        linked_list.add(16);
        linked_list.add(18);
        linked_list.add(20);

        System.out.println("Created LinkedList Is: " + linked_list);

        System.out.println("Head element of the list is : " + linked_list.poll());

        System.out.println("Linked List after removal using poll() : " + linked_list);

    }
}
