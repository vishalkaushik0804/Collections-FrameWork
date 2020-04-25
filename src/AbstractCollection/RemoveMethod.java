// Program to illustrate AbstractCollection remove() Method
package AbstractCollection;

import java.util.AbstractCollection;
import java.util.ArrayList;

public class RemoveMethod {

    public static void main(String[] args) {
        AbstractCollection<String> collection_list1 = new ArrayList<>();

        collection_list1.add("Program");
        collection_list1.add("To");
        collection_list1.add("Illustrate");
        collection_list1.add("addAll()");
        collection_list1.add("Method");

        System.out.println("Abstract Collection1: " + collection_list1);

        collection_list1.add("remove()");

        collection_list1.remove("addAll()");
        if (!collection_list1.remove("Hello")) { // returns boolean Value
            System.out.println("Element Does Not Exist !!");
        }

        System.out.println("After remove() method");
        System.out.println("Abstract Collection1: " + collection_list1);
    }
}
