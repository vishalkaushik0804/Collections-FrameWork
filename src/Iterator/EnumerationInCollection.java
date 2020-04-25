// Program to illustrate Enumeration in Collection
//It is a interface used to get elements of legacy collections(Vector, Hashtable)Hence it is not a universal iterator.
package Iterator;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationInCollection {

    public static void main(String[] args) {
        Vector<String> vector_object = new Vector<>();

        vector_object.addElement("Program");
        vector_object.addElement("To");
        vector_object.addElement("Illustrate");
        vector_object.addElement("Enumeration");
        vector_object.addElement("In");
        vector_object.addElement("Collection");

        System.out.println("Abstract Collection1: " + vector_object);

        Enumeration enumerator = vector_object.elements();

        System.out.println("The Enumerator values are: ");

        while (enumerator.hasMoreElements()) {
            System.out.println(enumerator.nextElement());
        }
    }
}
