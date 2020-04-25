// Program to illustrate Arraylist ArrayList(int capacity) Constructor
package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Constructor3 {

    public static void main(String[] args) {

        int size = 3;

        ArrayList<String> array_list = new ArrayList<>(size);

        array_list.add("Program");
        array_list.add("to");
        array_list.add("illustrate");
        array_list.add("Arraylist");
        array_list.add("ArrayList(int capacity)");
        array_list.add("Constructor");

        System.out.println("ArrayList is : ");

        Iterator itr = array_list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
            if (itr.hasNext() == false) {
                System.out.println("");
            }
        }
    }
}
