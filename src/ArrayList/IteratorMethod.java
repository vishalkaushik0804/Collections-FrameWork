//Program to illustrate Arraylist iterator() method
package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMethod {

    public static void main(String[] args) {
        ArrayList<Integer> array_list = new ArrayList<>();
        array_list.add(1);
        array_list.add(2);
        array_list.add(3);
        array_list.add(4);
        array_list.add(5);

        Iterator<Integer> itr = array_list.iterator();
        System.out.println("The iterator values of ArrayList are: ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
            if (itr.hasNext() == false) {
                System.out.println("");
            }
        }
    }
}
