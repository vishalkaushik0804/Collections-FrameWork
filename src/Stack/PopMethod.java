// Program to illustrate Stack pop() method 
package Stack;

import java.util.Stack;

public class PopMethod {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(12);
        stack.push(14);
        stack.push(16);
        stack.push(18);
        stack.push(20);

        System.out.println("Created Stack Is: " + stack);

        int popped_element = stack.pop();
        System.out.println("Popped Element: " + popped_element);

        System.out.println("Stack after Pop operation: " + stack);

        popped_element = stack.pop();
        System.out.println("Popped Element: " + popped_element);

        System.out.println("Stack after Pop operation: " + stack);

    }
}
