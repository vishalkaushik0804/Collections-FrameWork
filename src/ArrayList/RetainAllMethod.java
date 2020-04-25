//Program to illustrate Arraylist retainAll() method
package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class RetainAllMethod {

    public static void main(String[] args) {
        ArrayList<String> Boxes = new ArrayList<>();
        Boxes.add("Pen");
        Boxes.add("Pencil");
        Boxes.add("Eraser");
        Boxes.add("Sharpner");

        ArrayList<String> Bags = new ArrayList<>();
        Bags.add("Pen");
        Bags.add("Paper");
        Bags.add("Books");
        Bags.add("Pencil");
        Bags.add("Eraser");
        Bags.add("Sharpner");

        System.out.println("List for Boxes: ");
        displayList(Boxes);
        System.out.println("List for Bags: ");
        displayList(Bags);

        Bags.retainAll(Boxes);

        System.out.println("\nAfter RetainAll Operation ::::\n");
        System.out.println("List for Boxes: ");
        displayList(Boxes);
        System.out.println("List for Bags: ");
        displayList(Bags);

    }

    private static void displayList(ArrayList<String> list) {
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
            if (itr.hasNext() == false) {
                System.out.println("");
            }
        }
    }
}
