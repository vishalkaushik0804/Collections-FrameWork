//Program to illustrate NoSuchElementException in LinkedList getFirst() and getLast() methods.
package ExtraInformation;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class NoSuchElementExceptionDemo {

    public static void main(String[] args) {
        LinkedList<Integer> linked_list = new LinkedList<>();
        try {
            System.out.println("First Element of the Created" + linked_list.getFirst());

        } catch (NoSuchElementException e) {
            System.out.println("Exception while accessing First element: " + e);
            try {
                System.out.println("First Element of the Created" + linked_list.getLast());
            } catch (NoSuchElementException E) {
                System.out.println("Exception while accessing Last element: " + e);
            }
        }
    }

}
