// Program to illustrate AbstractCollection toArray() Method
package AbstractCollection;

import java.util.AbstractCollection;
import java.util.PriorityQueue;

public class ToArrayMethod {

    public static void main(String[] args) {
        AbstractCollection<String> collection_string = new PriorityQueue<>();

        collection_string.add("Program");
        collection_string.add("To");
        collection_string.add("Illustrate");
        collection_string.add("toArray()");
        collection_string.add("Method");

        System.out.println("Abstract Collection: " + collection_string);

        Object[] object_array = collection_string.toArray();

        System.out.println("\nThe Array Formed Is: \n");
        for (int i = 0; i < object_array.length; i++) {
            System.out.println(object_array[i]);
        }
    }
}
