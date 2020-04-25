// Program to illustrate AbstractCollection iterator() Method
package AbstractCollection;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMethod {

    public static void main(String[] args) {
        AbstractCollection<String> collection_list = new ArrayList<>();

        collection_list.add("Program");
        collection_list.add("To");
        collection_list.add("Illustrate");
        collection_list.add("iterator()");
        collection_list.add("Method");

        System.out.println("Abstract Collection1: " + collection_list);

        Iterator itr = collection_list.iterator();

        System.out.println("The iterator values are: ");
        
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
