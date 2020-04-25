// Program to illustrate Arraylist contains() method
package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ContainsMethod {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("For INTEGER ::::\n");
        ArrayList<Integer> array_list = new ArrayList<>();

        array_list.add(12);
        array_list.add(13);
        array_list.add(14);
        array_list.add(15);
        array_list.add(16);

        System.out.println("ArrayList Created (INTEGER) Is: ");
        displayListInteger(array_list);

        System.out.println("Enter the number to be search: ");
        int n = input.nextInt();

        boolean present = array_list.contains(n);

        if (present) {
            System.out.println("Number " + n + " is present in the created ArrayList !!");
        } else {
            System.out.println("Number " + n + " is not present in the created ArrayList !!\n");
        }

        System.out.println("For STRING ::::\n");
        ArrayList<String> array_list2 = new ArrayList<>();

        array_list2.add("Program");
        array_list2.add("to");
        array_list2.add("illustrate");
        array_list2.add("Arraylist");
        array_list2.add("contains()");
        array_list2.add("method");

        System.out.println("ArrayList Created (STRING) Is: ");
        displayListString(array_list2);

        System.out.println("Enter the string to be search: ");
        String string = input.next();

        boolean presence = array_list.contains(string);

        if (presence) {
            System.out.println("String " + string + " is present in the created ArrayList !!");
        } else {
            System.out.println("String " + string + " is not present in the created ArrayList !!");
        }

    }

    private static void displayListInteger(ArrayList<Integer> array_list) {
        Iterator itr = array_list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
            if (itr.hasNext() == false) {
                System.out.println("");
            }
        }
    }

    private static void displayListString(ArrayList<String> array_list) {
        Iterator itr = array_list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
            if (itr.hasNext() == false) {
                System.out.println("");
            }
        }
    }
}
