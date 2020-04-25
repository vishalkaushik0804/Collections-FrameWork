// Program to illustrate Arraylist get(index) method
package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GetMethod {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> array_list = new ArrayList<>();
        array_list.add(1);
        array_list.add(2);
        array_list.add(3);
        array_list.add(4);
        array_list.add(5);

        System.out.println("Created ArrayList Is: ");

        Iterator itr = array_list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
            if (itr.hasNext() == false) {
                System.out.println("");
            }
        }

        System.out.println("Enter the index of the element to get: ");
        int index = input.nextInt();

        System.out.println("Element at index " + index + " is: " + array_list.get(index - 1));
    }
}
