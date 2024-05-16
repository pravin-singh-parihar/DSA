package Array;


import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=2;i<=n;i++){
            if (n%i==0 && i!=n){
                System.out.println("Not Prime ");
                break;
            }else if (i==n){
                System.out.println("number is prime");
            }
            }
        }
    }

