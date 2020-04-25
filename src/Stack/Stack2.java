//Program to illustrate Introduction to Stack in Collection 
package Stack;

import java.util.Stack;

public class Stack2 {

    private static void stackPush(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    private static void stackPop(Stack<Integer> stack) {
        System.out.println("Pop Operation: ");
        for (int i = 0; i < 5; i++) {
            Integer y = stack.pop();
            System.out.print(y + " ");
        }
        System.out.println("");
    }

    private static void stackPeek(Stack<Integer> stack) {
        Integer peek_value = stack.peek();
        System.out.println("Element in the Stack top: " + peek_value);
    }

    private static void stackSearch(Stack<Integer> stack, int element) {
        Integer position = stack.search(element);
        if (position == -1) {
            System.out.println("Element Not Found!!");
        } else {
            System.out.println("Element Found At Position: " + position);
        }
    }

    public static void main(String[] args) {
       
        Stack<Integer> stack = new Stack<>();

        stackPush(stack);
        stackPop(stack);
        stackPush(stack);
        stackPeek(stack);
        stackSearch(stack, 2);
        stackSearch(stack, 6);
    }
}
