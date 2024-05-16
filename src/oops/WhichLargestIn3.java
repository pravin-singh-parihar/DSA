package oops;

import java.util.Scanner;

public class WhichLargestIn3 {
    public static void main(String[] args) {
        System.out.println("Enter the 3 numbers");
        Scanner scanner=new Scanner(System.in);

        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if (a>b && a>c)
            System.out.println( a+" is grater ");
        else if (b > c) {

            System.out.println(b+" is greater than among numbers");
        }else {
            System.out.println(c+" is grater than among number ");
        }
    }
}
