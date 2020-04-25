// Program to illustrate Arraylist remove(Obejct obj) method
package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveMethod2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> array_list = new ArrayList<>();

        array_list.add("Program");
        array_list.add("to");
        array_list.add("illustrate");
        array_list.add("Arraylist");
        array_list.add("remove(Obejct obj)");
        array_list.add("method");

        System.out.println("ArrayList Created Is: ");
        displayList(array_list);

        System.out.println("Enter the String to remove: ");
        String string = input.next();

        array_list.remove(string);

        System.out.println("ArrayList after remove operation: ");
        displayList(array_list);

    }

    private static void displayList(ArrayList<String> array_list) {
        Iterator itr = array_list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
            if (itr.hasNext() == false) {
                System.out.println("");
            }
        }
    }

}
