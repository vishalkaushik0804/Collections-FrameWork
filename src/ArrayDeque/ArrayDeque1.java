// Program to illustrate Introduction to ArrayDeque
package ArrayDeque;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeque1 {

    public static void main(String[] args) {
        Deque<Integer> array_deque = new ArrayDeque<>();

        array_deque.add(12);
        array_deque.add(14);
        array_deque.add(16);
        array_deque.add(18);
        array_deque.add(20);

        System.out.println("Created ArrayDeque Is: " + array_deque);

        System.out.println("Using clear() ");

        // clear() method 
        array_deque.clear();

        // addFirst() method to insert at start 
        array_deque.addFirst(564);
        array_deque.addFirst(291);

        // addLast() method to insert at end 
        array_deque.addLast(24);
        array_deque.addLast(14);

        System.out.println("Above elements are removed now");

        // Iterator() : 
        System.out.println("Elements of deque using Iterator :");
        for (Iterator itr = array_deque.iterator(); itr.hasNext();) {
            System.out.println(itr.next());
        }

        // descendingIterator() : to reverse the deque order 
        System.out.println("Elements of deque in reverse order :");
        for (Iterator dItr = array_deque.descendingIterator();
                dItr.hasNext();) {
            System.out.println(dItr.next());
        }

        // element() method : to get Head element 
        System.out.println("\nHead Element using element(): " + array_deque.element());

        // getFirst() method : to get Head element 
        System.out.println("Head Element using getFirst(): " + array_deque.getFirst());

        // getLast() method : to get last element 
        System.out.println("Last Element using getLast(): " + array_deque.getLast());

        // toArray() method : 
        Object[] arr = array_deque.toArray();
        System.out.println("\nArray Size : " + arr.length);

        System.out.print("Array elements : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

        // peek() method : to get head 
        System.out.println("\nHead element : " + array_deque.peek());

        // poll() method : to get head 
        System.out.println("Head element poll : " + array_deque.poll());

        // push() method : 
        array_deque.push(265);
        array_deque.push(984);
        array_deque.push(2365);

        // remove() method : to get head 
        System.out.println("Head element remove : " + array_deque.remove());

        System.out.println("The final array is: " + array_deque);

    }
}
