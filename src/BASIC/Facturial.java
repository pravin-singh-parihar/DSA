import java.util.Scanner;

public class Facturial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        for (int i = a-1;  i>0; i--) {
            a*=i;


        }
        System.out.println(a);

    }
}
