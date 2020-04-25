//Program to illustrate TreeSet subSet(Object low_element, Object up_element) method 
package TreeSet;

import java.util.TreeSet;

public class SubSetMethod {

    public static void main(String[] args) {
        TreeSet<Integer> tree_set = new TreeSet<>();

        tree_set.add(24);
        tree_set.add(23);
        tree_set.add(22);
        tree_set.add(21);
        tree_set.add(20);
        tree_set.add(19);
        tree_set.add(18);
        tree_set.add(17);

        System.out.println("Created TreeSet Is: " + tree_set);

        TreeSet<Integer> sub_set;
        sub_set = (TreeSet) tree_set.subSet(18, 23);

        System.out.println("The resultant values within the SubSet of TreeSet: "+sub_set);
    }
}
