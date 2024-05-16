package Array;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
       /* Create array*/
        int arr[]=new int[5];
        Scanner scanner=new Scanner(System.in);
      /* int arr1[] ={10,20,30,40,50};
       *//*insilagention of the aarry*//*
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        *//*printing of the aarry*//*
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        *//*length*//*
        System.out.println(arr.length);*/
        System.out.println("Fill the index value using loops");
        System.out.println("-------------------------");
        for (int i = 0; 5 > i; i++) {
            System.out.println("Enter the value in index = "+i);
             arr[i]=scanner.nextInt();
        }
        System.out.println("----------------------------------");
        System.out.println("Feating value in array");
        for (int i = 0; i < 5; i++) {
            System.out.println("Index value of the array"+i+"="+arr[i]);

        }
    }
}
