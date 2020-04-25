//Program to illustrate Introduction to LinkedList
package LinkedList;

import java.util.LinkedList;

public class LinkedList1 {

    public static void main(String[] args) {
        LinkedList<String> linked_list = new LinkedList<>();

        linked_list.add("Hey");
        linked_list.add("Introduction");
        linked_list.add(2,"Program");
        linked_list.add("To");
        linked_list.add("Collections");
        linked_list.add("LinkedList");
        linked_list.add("Class !!");

        System.out.println("Created LinkedList is: " + linked_list);

        linked_list.remove(2);
        linked_list.removeFirst();
        linked_list.removeLast();
        
        System.out.println("LinkedList after alterations: "+linked_list);

    }
}
