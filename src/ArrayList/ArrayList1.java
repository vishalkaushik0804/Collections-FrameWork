// Program to illustrate Introduction to ArrayList
package ArrayList;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

    public static void main(String[] args) {
        List<Integer> array_list = new ArrayList<Integer>() {
            {
                add(12);
                add(13);
                add(14);
                add(15);
                add(null);
            }
        };

        Iterator itr = array_list.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
            if (itr.hasNext() == false) {
                System.out.println("");
            }
        }

    }
}
