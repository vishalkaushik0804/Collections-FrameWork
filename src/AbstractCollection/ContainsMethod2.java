// Program to illustrate AbstractCollection boolean contains() Method 
package AbstractCollection;

import java.util.AbstractCollection;
import java.util.TreeSet;

public class ContainsMethod2 {

    public static void main(String[] args) {
        AbstractCollection<String> object = new TreeSet<>();

        object.add("Second");
        object.add("Example");
        object.add("Of");
        object.add("contains()");
        object.add("Method");

        System.out.println("Abstract Collection: " + object);

        System.out.println("Does the Collection contain 'Example': " + object.contains("Example"));

        System.out.println("Does the Collection contain 'Hello': " + object.contains("Hello"));

        System.out.println("Does the Collection contain 'Method': " + object.contains("Method"));

        System.out.println("Does the Collection contain 'TreeSet': " + object.contains("TreeSet"));

    }

}
