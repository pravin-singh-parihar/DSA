package COLLECTION.ARRAY_LIST;

import java.util.ArrayList;

public class ArrayListDomo {
    public static void main(String[] args) {
        /*ArrayList is the part of the collection. In which duplicate can be store and order are preserved.An ArrayList
        * nature having a growable
        * We can remove the value form arraylist */
        // CREATING ARRAYLIST
        ArrayList<Integer>al=new ArrayList<>();
        //addING ELEMENT IN ARRAYLIST
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);
        //PRINTING ELEMENT FORM THE ARRAYLIST
       // System.out.println(al);
        //al.remove(1);
        for (int i = 0; i <al.size() ; i++) {
            System.out.println(al.get(i));

        }

    }
}