// Program to illustrate Arraylist ArrayList(Collection c) Constructor
package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Constructor2 {

    public static void main(String[] args) {
        ArrayList<String> array_list1 = new ArrayList<>();

        array_list1.add("Program");
        array_list1.add("to");
        array_list1.add("illustrate");
        array_list1.add("Arraylist");
        array_list1.add("ArrayList(Collection c)");
        array_list1.add("Constructor");

        System.out.println("ArrayList1 is : ");
        DisplayList(array_list1);

        ArrayList< String> array_list2 = new ArrayList<>(array_list1);
        System.out.println("ArrayList2 is: ");
        DisplayList(array_list2);

    }

    private static void DisplayList(ArrayList<String> array_list) {
        Iterator itr = array_list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
            if (itr.hasNext() == false) {
                System.out.println("");
            }
        }
    }
}
