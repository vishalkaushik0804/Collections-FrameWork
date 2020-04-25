//Program to illustrate Arraylist ArrayList() Constructor
package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Constructor1 {

    public static void main(String[] args) {
        ArrayList<String> array_list = new ArrayList<>();

        array_list.add("Program");
        array_list.add("to");
        array_list.add("illustrate");
        array_list.add("Arraylist");
        array_list.add("ArrayList()");
        array_list.add("Constructor");

        Iterator itr = array_list.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
            if (itr.hasNext() == false) {
                System.out.println("");
            }
        }
    }
}
