//Program to illustrate LinkedList getLast() method 
package LinkedList;

import java.util.LinkedList;

public class GetLastMethod {

    public static void main(String[] args) {
        LinkedList<String> linked_list = new LinkedList<>();

        linked_list.add("Program");
        linked_list.add("to");
        linked_list.add("illustrate");
        linked_list.add("LinkedList");
        linked_list.add("getLast()");

        System.out.println("Created LinkedList Is: " + linked_list);

        System.out.println("Last Element of the LinkedList Is: " + linked_list.getLast());
    }
}
