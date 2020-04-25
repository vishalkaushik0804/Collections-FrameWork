// Program to illustrate Arraylist clone() method
package ArrayList;

import java.util.ArrayList;

public class CloneMethod {

    public static void main(String[] args) {
        ArrayList<Integer> array_list1 = new ArrayList<>();
        array_list1.add(1);
        array_list1.add(2);
        array_list1.add(3);
        array_list1.add(4);
        array_list1.add(5);

        System.out.println("ArrayList1 Is: " + array_list1);

        ArrayList<Integer> array_list2 = new ArrayList<>();

        array_list2 = (ArrayList<Integer>) array_list1.clone();

        System.out.println("ArrayList2 Is: " + array_list2);

    }
}
