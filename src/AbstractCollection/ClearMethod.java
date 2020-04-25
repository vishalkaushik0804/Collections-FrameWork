// Program to illustrate AbstractCollection clear() Method
package AbstractCollection;

import java.util.AbstractCollection;
import java.util.LinkedList;

public class ClearMethod {

    public static void main(String[] args) {
        AbstractCollection<String> collection_list1 = new LinkedList<>();

        collection_list1.add("Program");
        collection_list1.add("To");
        collection_list1.add("Illustrate");
        collection_list1.add("clear()");
        collection_list1.add("Method");

        System.out.println("Abstract Collection1: " + collection_list1);

        collection_list1.clear();

        System.out.println("Abstract Collection After clear() Method: " + collection_list1);
    }
}
