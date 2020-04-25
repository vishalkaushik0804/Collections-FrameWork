// Program to illustrate Stack elements() method 
package Stack;

import java.util.Enumeration;
import java.util.Stack;

public class ElementsMethod {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Created Stack Is: " + stack);

        System.out.println("Displaying Created Stack Using elements() Method: ");
        Enumeration enu = stack.elements();

        while (enu.hasMoreElements()) {
            System.out.print(enu.nextElement() + " ");
            if (enu.hasMoreElements() == false) {
                System.out.println("");
            }
        }
    }
}
