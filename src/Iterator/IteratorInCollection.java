// Program to illustrate Iterator in Collection
//Important Common Points
//1 : Please note that initially any iterator reference will point to the index just before the index of first element in a collection.
//2 : We don’t create objects of Enumeration, Iterator, ListIterator because they are interfaces. We use methods like elements(), iterator(), listIterator() to create objects. 
//These methods have anonymous Inner classes that extends respective interfaces and return this class object. 
//It is a universal iterator as we can apply it to any Collection object. By using Iterator, we can perform both read and remove operations. 
//It is improved version of Enumeration with additional functionality of remove-ability of a element.
package Iterator;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInCollection {

    public static void main(String[] args) {
        AbstractCollection<String> collection_list = new ArrayList<>();

        collection_list.add("Program");
        collection_list.add("To");
        collection_list.add("Illustrate");
        collection_list.add("Iterator");
        collection_list.add("In");
        collection_list.add("Collection");

        System.out.println("Abstract Collection1: " + collection_list);

        Iterator itr = collection_list.iterator();

        System.out.println("The Iterator values are: ");

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
