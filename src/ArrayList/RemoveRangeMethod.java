//Program to illustrate Arraylist removeRange(int fromIndex, int toIndex) method
//Note : removeRange(int fromIndex, int toIndex) method is protected method in ArrayList.
//A protected method is accessed in class, subclasses and in a package, but not public.
//Therefore we extend the class to arraylist.
package ArrayList;

import java.util.ArrayList;

public class RemoveRangeMethod extends ArrayList<Integer> {

    public static void main(String[] args) {
        RemoveRangeMethod array_list = new RemoveRangeMethod();

        array_list.add(1);
        array_list.add(2);
        array_list.add(3);
        array_list.add(4);
        array_list.add(5);

        System.out.println("ArrayList Created Is: " + array_list);

        array_list.removeRange(0, 2);

        System.out.println("The ArrayList after using removeRange Method:" + array_list);
    }
}
