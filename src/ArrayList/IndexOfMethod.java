//Program to illustrate Arraylist indexOf() method 
package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class IndexOfMethod {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> array_list = new ArrayList<>();

        array_list.add(1);
        array_list.add(2);
        array_list.add(4);
        array_list.add(5);
        array_list.add(15);
        array_list.add(12);
        array_list.add(1);

        Iterator itr = array_list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
            if (itr.hasNext() == false) {
                System.out.println("");
            }
        }

        System.out.println("Enter the element to get the Index: ");
        int number = input.nextInt();

        System.out.println("Element " + number + " is at Index: " + (array_list.indexOf(number) + 1));
    }

}
