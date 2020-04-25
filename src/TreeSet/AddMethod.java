//Program to illustrate TreeSet add(Object element) method 
package TreeSet;

import java.util.TreeSet;

public class AddMethod {

    public static void main(String[] args) {
        TreeSet<Integer> tree_set = new TreeSet<>();

        tree_set.add(12);
        tree_set.add(14);
        tree_set.add(15);
        tree_set.add(17);
        tree_set.add(13);

        System.out.println("Created HashSet of Integer Is: " + tree_set);

        
        TreeSet<String> tree = new TreeSet<>(); 
   
        tree.add("Welcome"); 
        tree.add("To"); 
        tree.add("Geeks"); 
        tree.add("4"); 
        tree.add("Geeks"); 
        tree.add("TreeSet"); 
  
        System.out.println("Created TreeSet of String Is: : " + tree); 
    }
}
