package Collection.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
//    Array list the group of the object and array list  are in nature gorable
// In array list we can store duplicate
//    Insertion oreader are priserved

    public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);
        //al.remove(2);//removing the object from the array list
        System.out.println(al);//Printing the Array list
        for (int i = 0; i <al.size() ; i++) {
            System.out.println(al.get(i));

        }
        System.out.println("----------------");
        for (Integer data:al){
            System.out.println(data);
        }
    }
}
