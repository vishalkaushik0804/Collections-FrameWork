// Program to illustrate ArrayList toArray() Method
package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ToArrayMethod1 {

    public static void main(String[] args) {
        ArrayList<String> arraylist_string = new ArrayList<>();

        arraylist_string.add("Program");
        arraylist_string.add("To");
        arraylist_string.add("Illustrate");
        arraylist_string.add("toArray()");
        arraylist_string.add("Method");

        System.out.println("Created ArrayList Is: " + arraylist_string);

        Object[] object_array = arraylist_string.toArray();

        System.out.println("\nElements of ArrayList as Array: " + Arrays.toString(object_array));
    }
}
