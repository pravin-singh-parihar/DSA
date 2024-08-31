import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        Scanner scanner=new Scanner(System.in);
        int term=scanner.nextInt();
        int c=0;
        for (int i = 1; i <=term ; i++) {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;

        }
    }
}
