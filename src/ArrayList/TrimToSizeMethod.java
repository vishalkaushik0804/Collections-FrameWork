// Program to illustrate ArrayList trimToSize() Method
package ArrayList;

import java.util.ArrayList;

public class TrimToSizeMethod {
    public static void main(String[] args) {
        ArrayList<Integer>array_list = new ArrayList<>();
        array_list.add(1);
        array_list.add(2);
        array_list.add(3);
        array_list.add(4);
        
        array_list.trimToSize();
        
        System.out.println("Created ArrayList Is: "+array_list);
        
        
    }
}
