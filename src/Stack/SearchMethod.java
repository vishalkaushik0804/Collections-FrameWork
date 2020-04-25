// Program to illustrate Stack search(element) method 
package Stack;

import java.util.Stack;

public class SearchMethod {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(8);

        System.out.println("Created Stack Is: " + stack);

        System.out.println("Does the stack contains '8'?  " + stack.search(8));

        System.out.println("Does the stack contains '21'? " + stack.search(21));

    }
}
