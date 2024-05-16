package Array;

import java.util.Scanner;

public class RivarseArray {
    public static void main(String[] args) {
        rivarseArray();

        }
        static void rivarseArray(){
            System.out.println("Original Array");
        int arr[]={10,50,34,56,70};
        for (int i = 0; i <arr.length ; ) {
            System.out.println(arr[i]);
        }
            System.out.println("------------------------------");
            System.out.println("Rivarse Array");
        for (int j = arr.length-1;  j>=0; j--) {
            System.out.println(arr[j]);
        }
    }
    }
