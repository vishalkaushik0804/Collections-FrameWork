// Program to demonstrate working of ArrayList in Java 
package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Size of ArrayList: ");
        int size = input.nextInt();

        ArrayList<Integer> array_list = new ArrayList<Integer>(size);

        for (int i = 1; i <= size; i++) {
            array_list.add(i);
        }

        System.out.println("ArrayList Created Is: " + array_list);

        array_list.remove(2);

        System.out.println("ArrayList After Removal: " + array_list);

        System.out.println("ArrayList Traversal Using Foreach Loop: ");
        for (int element : array_list) {
            System.out.print(element + " ");
        }
        System.out.println("");
    }
}
