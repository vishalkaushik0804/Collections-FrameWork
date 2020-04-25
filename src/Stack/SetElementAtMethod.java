// Program to illustrate Stack setElementAt(E element, int index) method 
package Stack;

import java.util.Stack;

public class SetElementAtMethod {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(11);
        stack.push(15);
        stack.push(13);
        stack.push(14);

        System.out.println("Created Stack Is: " + stack);

        stack.setElementAt(12, 2);

        System.out.println("Stack after SetElement operation: " + stack);
    }
}
