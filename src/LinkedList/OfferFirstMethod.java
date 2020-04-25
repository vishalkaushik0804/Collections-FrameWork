//Program to illustrate LinkedList offerFirst(E e) method 
package LinkedList;

import java.util.LinkedList;

public class OfferFirstMethod {

    public static void main(String[] args) {
        LinkedList<Integer> linked_list = new LinkedList<>();

        linked_list.add(1);
        linked_list.add(2);
        linked_list.add(3);
        linked_list.add(4);

        System.out.println("Created LinkedList Is: " + linked_list);

        linked_list.offerFirst(0);

        System.out.println("LinkedList after offerFirst operation: " + linked_list);
    }
}
