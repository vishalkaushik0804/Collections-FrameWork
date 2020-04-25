// Program to illustrate AbstractCollection size() Method
package AbstractCollection;

import java.util.AbstractCollection;
import java.util.LinkedList;

public class SizeMethod {

    public static void main(String[] args) {
        AbstractCollection<String> collection_list1 = new LinkedList<>();

        collection_list1.add("Program");
        collection_list1.add("To");
        collection_list1.add("Illustrate");
        collection_list1.add("size()");
        collection_list1.add("Method");

        System.out.println("Abstract Collection1: " + collection_list1);

        System.out.println("The size of the Collection is: " + collection_list1.size());
    }
}
