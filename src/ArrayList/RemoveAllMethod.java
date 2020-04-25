// Program to illustrate Arraylist removeAll(Collection c) method
package ArrayList;

import java.util.ArrayList;

public class RemoveAllMethod {

    public static void main(String[] args) {
        ArrayList<Integer> array_list1 = new ArrayList<>();
        array_list1.add(1);
        array_list1.add(2);
        array_list1.add(3);
        array_list1.add(4);
        array_list1.add(5);
        array_list1.add(6);
        array_list1.add(7);
        array_list1.add(8);

        System.out.println("ArrayList1 Is: " + array_list1);

        ArrayList<Integer> array_list2 = new ArrayList<>();
        array_list2.add(6);
        array_list2.add(7);
        array_list2.add(8);
        array_list2.add(9);

        System.out.println("ArrayList2 Is: " + array_list2);

        array_list1.removeAll(array_list2);

        System.out.println("ArrayList1 after removeAll() method for ArrayList2: " + array_list1);

        ArrayList<Integer> array_list3 = null;
        try {
            System.out.println("ArrayList3 Is: " + array_list3);
            array_list1.removeAll(array_list3);
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e);
        }
        System.out.println("ArrayList1 after removeAll() method for ArrayList3: " + array_list1);
    }
}
