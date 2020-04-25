//Program to illustrate LinkedList peek() method 
package LinkedList;

import java.util.LinkedList;

public class PeekMethod {

    public static void main(String[] args) {
        LinkedList<Integer> linked_list = new LinkedList<>();

        linked_list.add(12);
        linked_list.add(14);
        linked_list.add(16);
        linked_list.add(18);
        linked_list.add(20);

        System.out.println("Created LinkedList Is: " + linked_list);

        int peek_value = linked_list.peek();

        System.out.println("Peek Value of the LinkedList Is: " + peek_value);

    }
}
