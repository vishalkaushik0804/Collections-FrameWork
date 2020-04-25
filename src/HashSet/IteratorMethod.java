//Program to illustrate HashSet iterator() method 
package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorMethod {

    public static void main(String[] args) {
        HashSet<Integer> hash_set = new HashSet<>();

        hash_set.add(12);
        hash_set.add(13);
        hash_set.add(14);
        hash_set.add(15);
        hash_set.add(16);

        System.out.println("Created HashSet First Is: " + hash_set);

        System.out.println("Displaying HashSet Using Iterator Method: ");
        
        Iterator itr = hash_set.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
            if(itr.hasNext() == false){
                System.out.println("");
            }
        }
    }
}
