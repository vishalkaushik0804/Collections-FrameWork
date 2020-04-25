// Program to illustrate Stack lastIndexOf(Object element, int last_index) method 
package Stack;

import java.util.Stack;

public class LastIndexOfMethod1 {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.add("Geeks");
        stack.add("for");
        stack.add("Geeks");
        stack.add("10");
        stack.add("Geeks");

        System.out.println("Created Stack Is: " + stack);

        // The first position of an element 
        // is returned 
        System.out.println("The first occurrence of Geeks is at frst index:" + stack.indexOf("Geeks"));

        // Get the last occurrence of Geeks 
        // using lastIndexOf() method 
        System.out.println("The last occurrence of Geeks is at last index: " + stack.lastIndexOf("Geeks", 4));

    }
}
