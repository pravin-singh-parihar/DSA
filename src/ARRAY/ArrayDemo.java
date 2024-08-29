package ARRAY;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        //CREATING ARRAY
        int []arr=new int[5];
        //int arr1[]=new int[5];
       /* int []arr2={10,20,30,40,50};

       */
        //Storing element in Array
       /* arr[0]=10;
        arr[1]=20;
        arr[2]=20;
        arr[3]=20;
        arr[4]=20;*/
        //FEATING ELEMENT FORM ARRAY
        //System.out.println(arr[3]);
        //STORING ELEMENT USING LOOP
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("Enter the element in index "+i);
            arr[i]=scanner.nextInt();
        }
        System.out.println("________________________-");
// Feating element from the array using loop
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }


    }
}
