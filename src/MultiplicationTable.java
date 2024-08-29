import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number  ");
        int a=scanner.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(a*i);

        }
    }
}
