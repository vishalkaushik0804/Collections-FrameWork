//Program to illustrate LinkedList push(Object element) method
package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class PushMethod {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Integer> linked_list = new LinkedList<>();

        linked_list.add(1);
        linked_list.add(2);
        linked_list.add(3);
        linked_list.add(4);
        linked_list.add(5);

        System.out.println("Created LinkedList Is: " + linked_list);

        System.out.println("Enter the Value to be entered on the top of the LinkedList: ");
        int push_value = input.nextInt();

        linked_list.push(push_value);
        System.out.println("LinkedList After PUSH Operation: " + linked_list);

    }

}
