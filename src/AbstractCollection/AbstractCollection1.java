//Program to illustrate AbstractCollection  
package AbstractCollection;


import java.util.AbstractCollection;
import java.util.ArrayList;

public class AbstractCollection1 {

    public static void main(String[] args) {
        AbstractCollection<Object> abstract_collection1 = new ArrayList<>();

        abstract_collection1.add("Welcome");
        abstract_collection1.add("To");
        abstract_collection1.add("Collection");
        abstract_collection1.add("Framework !!");

        System.out.println("AbstractCollection: " + abstract_collection1);

    }
}
