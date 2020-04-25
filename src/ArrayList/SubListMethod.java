// Program to illustrate List subList(int fromIndex, int toIndex) Method
package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class SubListMethod {

    public static void main(String[] args) {
        ArrayList<Integer> array_list1 = new ArrayList<>();
        array_list1.add(1);
        array_list1.add(2);
        array_list1.add(3);
        array_list1.add(4);
        array_list1.add(5);
        array_list1.add(6);
        array_list1.add(7);

        System.out.println("Created ArrayList1 Is: " + array_list1);

        List<Integer> array_list2 = array_list1.subList(0, 4);

        System.out.println("Created List array_list2 Is: " + array_list2);

    }
}
