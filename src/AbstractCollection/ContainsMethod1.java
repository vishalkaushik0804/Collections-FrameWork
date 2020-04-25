// Program to illustrate AbstractCollection boolean contains() Method 
package AbstractCollection;


import java.util.AbstractCollection;
import java.util.LinkedList;

public class ContainsMethod1 {

    public static void main(String[] args) {

        // Creating an empty Collection 
        AbstractCollection<String> string_object = new LinkedList<>();

        string_object.add("Program");
        string_object.add("To");
        string_object.add("Illustrate");
        string_object.add("contains()");
        string_object.add("Method");

        // Displaying the collection 
        System.out.println("Abstract Collection: " + string_object);

        // Check if the Collection contains "Program"
        System.out.println("Does the Collection contain 'Program': " + string_object.contains("Program"));

        // Check if the Collection contains "Hello"
        System.out.println("Does the Collection contain 'Hello': " + string_object.contains("Hello"));

    }

}
