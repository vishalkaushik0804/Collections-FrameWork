// Program to illustrate Stack lastIndexOf(Object element) method 
package Stack;

import java.util.Stack;

public class LastIndexOfMethod2 {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.add("Geeks");
        stack.add("for");
        stack.add("Geeks");
        stack.add("10");
        stack.add("Geeks");

        System.out.println("Created Stack Is: " + stack);

        System.out.println("Last occurrence of \"Geeks\" is at index: " + stack.lastIndexOf("Geeks"));
    }
}
