//Program to illustrate LinkedList getFirst() method 
package LinkedList;

import java.util.LinkedList;        

public class GetFirstMethod {

    public static void main(String[] args) {
        LinkedList<Integer> linked_list = new LinkedList<>();

        linked_list.add(12);
        linked_list.add(13);
        linked_list.add(14);
        linked_list.add(15);
        linked_list.add(16);
        linked_list.add(17);

        System.out.println("Created LinkedList Is: " + linked_list);

        System.out.println("First Element of the LinkedList Is: " + linked_list.getFirst());
    }
}
