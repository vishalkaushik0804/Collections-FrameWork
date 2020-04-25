// Program to illustrate Stack empty() method 
package Stack;

import java.util.Stack;

public class EmptyMethod {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(20);
        stack.push(18);
        stack.push(16);
        stack.push(14);
        stack.push(12);

        System.out.println("Created Stack Is: " + stack);

        System.out.println("Is the stack empty? " + stack.empty());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("After POP Operation: ");

        System.out.println("Is the stack empty? " + stack.empty());

    }
}
