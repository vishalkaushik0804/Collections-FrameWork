// Program to illustrate AbstractCollection toArray(arr[]) Method
// To demonstrate NullPointerException
package AbstractCollection;

import java.util.AbstractCollection;
import java.util.PriorityQueue;

public class ToArrayMethod5 {

    public static void main(String[] args) {
        AbstractCollection<String> collection_string = new PriorityQueue<>();

        collection_string.add("Program");
        collection_string.add("To");
        collection_string.add("Illustrate");
        collection_string.add("toArray(arr[])");
        collection_string.add("Method");

        System.out.println("Abstract Collection: " + collection_string);

        try {
            String[] string_array = null;
            string_array = collection_string.toArray(string_array);

            System.out.println("\nThe Array Formed Is: \n");
            for (String string_array1 : string_array) {
                System.out.println(string_array1);
            }
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e);
        }

    }
}
