//Program to illustrate TreeSet equals() method 
package TreeSet;

import java.util.TreeSet;

public class EqualsMethod {

    public static void main(String[] args) {
        TreeSet<Integer> tree_set1 = new TreeSet<>();

        tree_set1.add(20);
        tree_set1.add(18);
        tree_set1.add(16);
        tree_set1.add(14);
        tree_set1.add(12);

        System.out.println("Created TreeSet First Is: " + tree_set1);

        TreeSet<Integer> tree_set2 = new TreeSet<>();

        tree_set2.add(12);
        tree_set2.add(14);
        tree_set2.add(16);
        tree_set2.add(18);
        tree_set2.add(20);

        System.out.println("Created TreeSet Second Is: " + tree_set2);

        boolean isEqual = tree_set1.equals(tree_set2);

        if(isEqual){
            System.out.println("TreeSet1 And TreeSet2 Are Equal!!");
        }else{
            System.out.println("NOT EQUAL !! ");
        }
    }
}
