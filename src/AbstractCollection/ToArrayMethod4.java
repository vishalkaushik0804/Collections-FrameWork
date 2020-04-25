// Program to illustrate AbstractCollection toArray(arr[]) Method
// When array is more than the size of AbstractCollection
package AbstractCollection;

import java.util.AbstractCollection;
import java.util.PriorityQueue;

public class ToArrayMethod4 {

    public static void main(String[] args) {
        AbstractCollection<String> collection_string = new PriorityQueue<>();

        collection_string.add("Program");
        collection_string.add("To");
        collection_string.add("Illustrate");
        collection_string.add("toArray(arr[])");
        collection_string.add("Method");

        System.out.println("Abstract Collection: " + collection_string);

        String[] string_array = new String[collection_string.size() + 2];
        string_array = collection_string.toArray(string_array);

        System.out.println("\nThe Array Formed Is: \n");
        for (String string_array1 : string_array) {
            System.out.println(string_array1);
        }
    }
}
