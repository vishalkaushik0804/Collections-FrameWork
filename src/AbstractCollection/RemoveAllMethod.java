// Program to illustrate AbstractCollection removeAll() Method
package AbstractCollection;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedList;

public class RemoveAllMethod {

    public static void main(String[] args) {
        AbstractCollection<String> collection_list1 = new ArrayList<>();

        collection_list1.add("Program");
        collection_list1.add("To");
        collection_list1.add("Illustrate");
        collection_list1.add("removeAll()");
        collection_list1.add("Method");

        System.out.println("Abstract Collection1: " + collection_list1);

        AbstractCollection<String> collection_list2 = new LinkedList<>();
        collection_list2.add("Program");
        collection_list2.add("To");
        collection_list2.add("Illustrate");

        System.out.println("Abstract Collection2: " + collection_list2);

        collection_list1.removeAll(collection_list2);
        System.out.println("After removeAll() method: ");
        System.out.println("For Abstract Collection2: " + collection_list1);

        AbstractCollection<String> collection_list3 = null;
        try {
            collection_list1.removeAll(collection_list3);
            System.out.println("For Abstract Collection3: "+collection_list1);
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e);
        }

    }
}
