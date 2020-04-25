// Program to illustrate AbstractCollection toArray(arr[]) Method
package AbstractCollection;

import java.util.AbstractCollection;
import java.util.PriorityQueue;

public class ToArrayMethod1 {

    public static void main(String[] args) {
        AbstractCollection<String> collection_string = new PriorityQueue<>();

        collection_string.add("Program");
        collection_string.add("To");
        collection_string.add("Illustrate");
        collection_string.add("toArray(arr[])");
        collection_string.add("Method");

        System.out.println("Abstract Collection: " + collection_string);

        Object[] object_array = new Object[collection_string.size()];
        
        object_array = collection_string.toArray(object_array);
       
        System.out.println("\nThe Array Formed Is: \n");
        for (Object object_array1 : object_array) {
            System.out.println(object_array1);
        }
    }
}
