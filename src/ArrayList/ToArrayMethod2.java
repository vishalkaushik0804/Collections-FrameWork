// Program to illustrate ArrayList toArray(arr[]) Method
package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ToArrayMethod2 {

    public static void main(String[] args) {
        ArrayList<String> arrayList_string = new ArrayList<>();

        arrayList_string.add("Program");
        arrayList_string.add("To");
        arrayList_string.add("Illustrate");
        arrayList_string.add("toArray(arr[])");
        arrayList_string.add("Method");

        System.out.println("ArrayList Created Is : " + arrayList_string);

        String[] string_array = new String[arrayList_string.size()];

        string_array = arrayList_string.toArray(string_array);

        System.out.println("\nElements of ArrayList as Array: " + Arrays.toString(string_array));
    }
}
