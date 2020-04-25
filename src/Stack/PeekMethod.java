// Program to illustrate Stack peek() method 
package Stack;

import java.util.Stack;

public class PeekMethod {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(12);
        stack.push(14);
        stack.push(16);
        stack.push(18);
        stack.push(20);

        System.out.println("Created Stack Is: " + stack);

        System.out.println("The element at the top of the stack is: " + stack.peek());
    }
}
