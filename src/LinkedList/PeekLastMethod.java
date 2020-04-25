//Program to illustrate LinkedList peekLast() method 
package LinkedList;

import java.util.LinkedList;

public class PeekLastMethod {

    public static void main(String[] args) {
        LinkedList<Integer> linked_list = new LinkedList<>();

        linked_list.add(12);
        linked_list.add(14);
        linked_list.add(16);
        linked_list.add(18);
        linked_list.add(20);

        System.out.println("Created LinkedList Is: " + linked_list);

        int peek_value = linked_list.peekLast();

        System.out.println("Peek Value from the end of the LinkedList Is: " + peek_value);

    }
}
