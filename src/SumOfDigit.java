import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=0;
        while (n>0){
            int temp=n%10;//add the last digit
            sum+=temp; //sum of the digit
            n=n/10;//remove the last digit
        }
        System.out.print(sum);
    }
}
