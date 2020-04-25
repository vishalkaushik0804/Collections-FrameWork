//Program to demonstrate working of Double Brace Initialization 
package ExtraInformation;

import java.util.ArrayList;
import java.util.List;

public class DoubleBraceInitialization {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>() {
            {
                add(21);
                add(22);
                add(23);
                add(24);
            }
        };

        displayCollection(list);
    }

    private static void displayCollection(List<Integer> list) {
        System.out.println("ArrayList Created Is: " + list);
    }
}
