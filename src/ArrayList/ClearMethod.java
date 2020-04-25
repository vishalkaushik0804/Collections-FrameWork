// Program to illustrate Arraylist clear() method
package ArrayList;

import java.util.ArrayList;

public class ClearMethod {

    public static void main(String[] args) {
        ArrayList<Integer> array_list = new ArrayList<>();
        array_list.add(12);
        array_list.add(14);
        array_list.add(15);
        array_list.add(16);

        System.out.println("Created ArrayList: " + array_list);

        array_list.clear();

        System.out.println("ArrayList After clear() Method: " + array_list);
    }
}
