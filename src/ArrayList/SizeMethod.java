//Program to illustrate Arraylist size() method
package ArrayList;

import java.util.ArrayList;

public class SizeMethod {

    public static void main(String[] args) {
        ArrayList<Integer> array_list1 = new ArrayList<>();

        array_list1.add(1);
        array_list1.add(2);
        array_list1.add(3);
        array_list1.add(4);

        System.out.println("Created ArrayList1: " + array_list1);
        
        System.out.println("Size of the ArrayList1 is: " + array_list1.size());
        
        ArrayList<String> array_list2 = new ArrayList<>();
        array_list2.add("Program");
        array_list2.add("to");
        array_list2.add("illustrate");
        array_list2.add("Arraylist");
        array_list2.add("size()");
        array_list2.add("method");

        System.out.println("Created ArrayList2: " + array_list2);

        System.out.println("Size of the ArrayList2 is: " + array_list2.size());
    }
}
