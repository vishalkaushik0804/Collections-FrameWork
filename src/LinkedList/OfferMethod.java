//Program to illustrate LinkedList offer(E e) method 
package LinkedList;

import java.util.LinkedList;

public class OfferMethod {

    public static void main(String[] args) {
        LinkedList<Integer> linked_list = new LinkedList<>();

        linked_list.add(1);
        linked_list.add(2);
        linked_list.add(3);
        linked_list.add(4);

        System.out.println("Created LinkedList Is: " + linked_list);

        linked_list.offer(5);

        System.out.println("LinkedList after offer operation: " + linked_list);
    }
}
