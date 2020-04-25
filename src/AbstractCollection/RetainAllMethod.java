// Program to illustrate AbstractCollection retainAll() Method
package AbstractCollection;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedList;

public class RetainAllMethod {

    public static void main(String[] args) {
        AbstractCollection<String> collection_list1 = new ArrayList<>();

        collection_list1.add("Program");
        collection_list1.add("To");
        collection_list1.add("Illustrate");
        collection_list1.add("retainAll()");
        collection_list1.add("Method");

        System.out.println("Abstract Collection1: " + collection_list1);

        AbstractCollection<String> collection_list2 = new LinkedList<>();
        collection_list2.add("retainAll()");
        collection_list2.add("Method");

        System.out.println("Abstract Collection2: " + collection_list2);

        collection_list1.retainAll(collection_list2);

        System.out.println("After invoking retainAll() method\n Abstract Collection1: " + collection_list1);
    }
}
