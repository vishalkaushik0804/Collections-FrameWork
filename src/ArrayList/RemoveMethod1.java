// Program to illustrate Arraylist remove(int index) method
package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveMethod1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> array_list = new ArrayList<>();

        array_list.add(2);
        array_list.add(4);
        array_list.add(6);
        array_list.add(8);
        array_list.add(10);

        System.out.println("ArrayList Created Is: ");
        displayList(array_list);

        System.out.println("Enter the index of the Element to remove: ");
        int index = input.nextInt();

        array_list.remove(index - 1);

        System.out.println("ArrayList after remove operation: ");
        displayList(array_list);

    }

    private static void displayList(ArrayList<Integer> array_list) {
        Iterator itr = array_list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
            if (itr.hasNext() == false) {
                System.out.println("");
            }
        }
    }

}
