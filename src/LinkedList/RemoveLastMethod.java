//Program to illustrate LinkedList removeLast() method 
package LinkedList;

import java.util.LinkedList;

public class RemoveLastMethod {

    public static void main(String[] args) {
        LinkedList<Integer> linked_list = new LinkedList<>();

        linked_list.add(0);
        linked_list.add(1);
        linked_list.add(2);
        linked_list.add(3);
        linked_list.add(4);

        System.out.println("Created LinkedList Is: " + linked_list);

        linked_list.removeLast();

        System.out.println("LinkedList after removeLast operation: " + linked_list);
    }
}
