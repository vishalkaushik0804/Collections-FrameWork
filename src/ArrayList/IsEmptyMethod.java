// Program to illustrate Arraylist isEmpty() method 
package ArrayList;

import java.util.ArrayList;

public class IsEmptyMethod {

    public static void main(String[] args) {
        ArrayList<Integer> array_list = new ArrayList<>();
        boolean empty = array_list.isEmpty();
        if (empty) {
            System.out.println("ArrayList Is Empty !!");
        } else {
            System.out.println("ArrayList Is Not Empty !!");
        }

        array_list.add(12);
        empty = array_list.isEmpty();

        if (empty) {
            System.out.println("ArrayList Is Empty !!");
        } else {
            System.out.println("Created ArrayList Is: " + array_list);
        }
    }
}
