// // Program to illustrate AbstractCollection toString() Method
package AbstractCollection;

import java.util.AbstractCollection;
import java.util.PriorityQueue;

public class ToStringMethod {

    public static void main(String[] args) {
        AbstractCollection<String> collection_string = new PriorityQueue<>();

        collection_string.add("Program");
        collection_string.add("To");
        collection_string.add("Illustrate");
        collection_string.add("toString()");
        collection_string.add("Method");

        AbstractCollection<Integer> collection_integer_list = new PriorityQueue<>();
        collection_integer_list.add(10);
        collection_integer_list.add(20);
        collection_integer_list.add(30);
        collection_integer_list.add(40);

        System.out.println("Abstract Collection1: " + collection_string);
        System.out.println("Abstract Cllection2: " + collection_integer_list);

        String converted_string = collection_string.toString();
        String converted_integer_string = collection_integer_list.toString();

        System.out.println("After applying toString() method, new generated String is : " + converted_string);
        System.out.println("After applying toString() method, new generated InteString is : " + converted_integer_string);
    }
}
