package Recursion;

import static sun.misc.Version.print;

public class OneToFive {
    public static void main(String[] args) {
        //print(5);
        //print2(5);
        System.out.println();
    }
    //printing number one to five using recursive
    public static void print(int n){
        if (n==0) return;
       print(n-1);
        System.out.println(n);
    }
    //Printing odd and even numbers
    public static void print2(int n){
        if (n==0)return;
        if (n%2==0) System.out.println(n);
    }
    public static void print3(boolean n){


    }
}
