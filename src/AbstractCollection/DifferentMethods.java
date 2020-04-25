// Program to illustrate methods of AbstractCollection 
package AbstractCollection;


import java.util.AbstractCollection;
import java.util.TreeSet;

public class DifferentMethods {

    public static void main(String[] args) {
        AbstractCollection<String> abstract_collection_object1 = new TreeSet<>();

        abstract_collection_object1.add("Welcome");
        abstract_collection_object1.add("To");
        abstract_collection_object1.add("Collection");
        abstract_collection_object1.add("Framework");
        abstract_collection_object1.add("PART1");
        abstract_collection_object1.add("AbstractCollection");

        //Displaying the Collection
        System.out.println("AbstractCollection1: " + abstract_collection_object1);

        // Creating anothe Collection 
        AbstractCollection<String> abstract_collection_object2 = new TreeSet<>();

        // Displaying the Collection 
        System.out.println("AbstractCollection2: " + abstract_collection_object2);

        // Using addAll() method to Append 
        abstract_collection_object2.addAll(abstract_collection_object1);

        // Displaying the Collection 
        System.out.println("AbstractCollection2: " + abstract_collection_object2);

        // Clearing the collection using clear() method 
        abstract_collection_object1.clear();

        // Check for the empty collection 
        System.out.println("Is the Collection1 Empty?" + abstract_collection_object1.isEmpty());
    }
}
