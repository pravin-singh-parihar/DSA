package BASIC;
import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean isPrime=true;
        if (a<=1){
            isPrime=false;

        }else {
            for (int i = 2; i <=a ; i++) {
                if (a%i==0){
                    isPrime=false;
                    break;
                }

            }
        }
        if (isPrime){
            System.out.println(a+" Is Prime number");
        }
        else {
            System.out.println(a+" Is not a Prime number " );
        }
    }
}


