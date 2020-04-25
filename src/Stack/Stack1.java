//Program to illustrate Introduction to Stack in Collection
package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Stack1 {

    public static void main(String[] args) {
        Stack<Integer> stack_list = new Stack<>();

        stack_list.push(20);
        stack_list.push(18);
        stack_list.push(16);
        stack_list.push(14);
        stack_list.push(12);

        System.out.println("Created Stack is: " + stack_list);

        int[] stack_array = new int[stack_list.size()];

        for (int i = 0; i < 5; i++) {
            stack_array[i] = stack_list.pop();
        }

        System.out.println(Arrays.toString(stack_array));
    }
}
