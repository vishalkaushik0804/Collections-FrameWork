// // Program to illustrate AbstractCollection isEmpty() Method
package AbstractCollection;

import java.util.AbstractCollection;
import java.util.PriorityQueue;

public class IsEmptyMethod {

    public static void main(String[] args) {
        AbstractCollection<String> collection_string1 = new PriorityQueue<>();

        collection_string1.add("Program");
        collection_string1.add("To");
        collection_string1.add("Illustrate");
        collection_string1.add("isEmpty()");
        collection_string1.add("Method");

        if (!collection_string1.isEmpty()) {
            System.out.println("Abstract Collection 1: " + collection_string1);

        } else {
            System.out.println("Abstract Collection 1 is Empty !!");
        }

        AbstractCollection<String> collection_string2 = new PriorityQueue<>();

        if (!collection_string2.isEmpty()) {
            System.out.println("Abstract Collection2: " + collection_string2);

        } else {
            System.out.println("Abstract Collection 2 is Empty !!");
        }

    }
}
