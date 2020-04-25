// Program to illustrate AbstractCollection boolean containsAll() Method
package AbstractCollection;

import java.util.AbstractCollection;
import java.util.LinkedList;

public class ContainsAllMethod {

    public static void main(String[] args) {
        AbstractCollection<String> collection_list1 = new LinkedList<>();

        collection_list1.add("Program");
        collection_list1.add("To");
        collection_list1.add("Illustrate");
        collection_list1.add("containAll()");
        collection_list1.add("Method");

        System.out.println("Abstract Collection1: " + collection_list1);

        AbstractCollection collection_list2 = new LinkedList<>();

        collection_list2.add("Program");
        collection_list2.add("To");
        collection_list2.add("Illustrate");
        collection_list2.add("containAll()");
        collection_list2.add("Method");

        System.out.println("Abstract Collection2: " + collection_list2);

        System.out.println("Both the Collections Same: " + collection_list1.containsAll(collection_list2));
    }
}
