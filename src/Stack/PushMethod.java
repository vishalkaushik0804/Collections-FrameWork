// Program to illustrate Stack push(E element) method 
package Stack;

import java.util.Stack;

public class PushMethod {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Stack");
        stack.push("push(E element)");
        stack.push("Method");

        System.out.println("Created Stack Is: " + stack);

        stack.push("In");
        stack.push("Collections");

        System.out.println("Updated Stack Is: " + stack);
    }
}
