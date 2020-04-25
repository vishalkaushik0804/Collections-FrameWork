// Program to illustrate Arraylist ensureCapacity() method
package ArrayList;

import java.util.ArrayList;

public class EnsureCapacityMethod {

    public static void main(String[] args) {
        ArrayList<Integer> array_list1 = new ArrayList<>();
        array_list1.add(1);
        array_list1.add(2);
        array_list1.add(3);
        array_list1.add(4);

        System.out.println("Created Integer ArrayList1: " + array_list1);

        array_list1.ensureCapacity(4000);
        System.out.println("ArrayList can now surely store upto 4000 elements.");

        ArrayList<String> array_list2 = new ArrayList<>();
        array_list2.add("Program");
        array_list2.add("to");
        array_list2.add("illustrate");
        array_list2.add("Arraylist");
        array_list2.add("ensureCapacity()");
        array_list2.add("method");

        System.out.println("Created String ArrayList2: " + array_list2);

        array_list2.ensureCapacity(400);
        System.out.println("ArrayList can now surely store upto 400 elements.");

    }
}
