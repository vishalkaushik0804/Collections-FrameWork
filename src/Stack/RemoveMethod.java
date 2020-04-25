// Program to illustrate Stack remove(int index) method 
package Stack;

import java.util.Stack;

public class RemoveMethod {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Created Stack Is: " + stack);

        Integer removed_element = stack.remove(4);

        System.out.println("Removed Element: " + removed_element);

        System.out.println("Stack after Remove operation: " + stack);
    }
}
