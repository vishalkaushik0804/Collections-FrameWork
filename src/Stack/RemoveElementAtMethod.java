// Program to illustrate Stack removeElementAt(int index) method 
package Stack;

import java.util.Stack;

public class RemoveElementAtMethod {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        stack.push(16);

        System.out.println("Created Stack Is: " + stack);

        stack.removeElementAt(2);

        System.out.println("Stack after removeElementAt operation: " + stack);
    }
}
