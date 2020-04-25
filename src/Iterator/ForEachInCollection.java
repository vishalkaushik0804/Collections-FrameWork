// Program to illustrate ForEach Loop in Collection For Traversing
package Iterator;

import java.util.ArrayList;
import java.util.LinkedList;

public class ForEachInCollection {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(2);
        list1.add(30);
        list1.add(12);
        list1.add(8);

        System.out.println("List1: " + list1);

        LinkedList<Integer> list2 = new LinkedList<>();

        list2.add(10);
        list2.add(11);
        list2.add(12);

        System.out.println("List2: " + list2);

        System.out.println("After Comparison B/w List1 and List2: ");

        for (int a : list1) {
            for (int b : list2) {
                if (a < b) {
                    System.out.print(a + " ");
                }
            }
        }

    }

}
