//Program to illustrate LinkedList pop() method
package LinkedList;

import java.util.LinkedList;

public class PopMethod {

    public static void main(String[] args) {
        LinkedList<Integer> linked_list = new LinkedList<>();

        linked_list.add(1);
        linked_list.add(2);
        linked_list.add(3);
        linked_list.add(4);
        linked_list.add(5);

        System.out.println("Created LinkedList Is: " + linked_list);

        int top_value = linked_list.pop();
        System.out.println("Top Value of LinkedList Is: " + top_value);

        System.out.println("LinkedList After POP Operation: " + linked_list);

    }

}
