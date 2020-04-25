// Program to illustrate Arraylist set(int index, E element) method
package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SetMethod {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> array_list = new ArrayList<>();
        array_list.add(1);
        array_list.add(2);
        array_list.add(3);
        array_list.add(4);
        array_list.add(5);

        System.out.println("Created ArrayList Is: ");

        displayList(array_list);

        System.out.println("Enter the index of the element to be set: ");
        int index = input.nextInt()-1;
        System.out.println("Enter the value to be set: ");
        int value = input.nextInt();

        array_list.set(index, value);
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
