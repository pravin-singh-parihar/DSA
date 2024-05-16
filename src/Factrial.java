import java.util.Scanner;

public class Factrial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        double a=1;
        for (int i = n; i>=1 ; i--) {
            a=a*i;


        }
        System.out.print("Factrial of "+n+" = "+a);
    }
}
