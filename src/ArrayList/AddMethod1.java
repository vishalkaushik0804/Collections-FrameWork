// Program to illustrate Arraylist add(Object o) method 
package ArrayList;

import java.util.ArrayList;

public class AddMethod1 {

    public static void main(String[] args) {
        ArrayList<Integer> array_list = new ArrayList<>();

        array_list.add(12);
        array_list.add(13);
        array_list.add(14);
        array_list.add(15);

        for (int element : array_list) {
            System.out.print(element + " ");
        }
        System.out.println("");
    }
}
