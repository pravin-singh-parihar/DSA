package ARRAY;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a>b &&a>c){
            System.out.println(a+" Is greater than");
        }else if (b>c){
            System.out.println(b+ " Is greater than");
        }else {
            System.out.println(c+" Is greater than");
        }
    }
}
