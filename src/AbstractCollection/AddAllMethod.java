// Program to illustrate AbstractCollection addAll() Method
package AbstractCollection;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedList;

public class AddAllMethod {

    public static void main(String[] args) {
        AbstractCollection<String> collection_list1 = new ArrayList<>();

        collection_list1.add("Program");
        collection_list1.add("To");
        collection_list1.add("Illustrate");
        collection_list1.add("addAll()");
        collection_list1.add("Method");

        System.out.println("Abstract Collection1: " + collection_list1);

        AbstractCollection<String> collection_list2 = new LinkedList<>();

        System.out.println("Abstract Collection2: " + collection_list2);

        collection_list2.addAll(collection_list1);
        System.out.println("After addAll() method: ");
        System.out.println("Abstract Collection1: " + collection_list2);
    }
}
