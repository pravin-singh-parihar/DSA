package Array;

import java.util.Scanner;

public class GenrateMultiplicationTable {
    // CREATE A PROGRAM TO GENERATE THE MULTIPLICATION TABLE
    //INPUT 10;
    // 10 ,20,30,40,50,60,70,80,90,100
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);//get input from the user
        int n=scanner.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i*n);//Printing multiplication table

        }
    }
}
