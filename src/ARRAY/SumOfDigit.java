package ARRAY;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=scanner.nextInt();
        int res=0;
        int sum=0;
        while (n!=0){
            res=n%10;
            sum+=res;
            n=n/10;

        }
        System.out.println(sum);
    }
}
