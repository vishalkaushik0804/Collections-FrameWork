// Program to illustrate Stack copyInto(Object Stack[]) method 
package Stack;

import java.util.Stack;

public class CopyIntoMethod {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.add(20);
        stack.add(40);
        stack.add(60);
        stack.add(80);
        stack.add(100);

        System.out.println("Created Stack Is: " + stack);

        Integer stack_array [] = new Integer[5];

        stack_array[0] = 120;
        stack_array[1] = 140;

        System.out.println("Created Stack Array: ");
        for (Integer i : stack_array) {
            System.out.print(i + " ");
        }
        System.out.println("");

        stack.copyInto(stack_array);

        System.out.println("Updated Stack Array: ");
        for (Integer i : stack_array) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
