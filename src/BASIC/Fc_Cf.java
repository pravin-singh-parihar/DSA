import java.util.Scanner;

public class Fc_Cf {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double cl,fh;
        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option (1 or 2): ");
        int choice=scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter the celsius");
                cl=scanner.nextDouble();
                fh=(cl*9/5)+32;
                System.out.println("Temperture in Fahrenheit "+fh);
                break;
            case 2:
                System.out.println("Enter the fahrenheit");
                fh=scanner.nextDouble();
                cl=(fh-32)*5/9;
                System.out.println("Temperture in Celsius "+cl);
                break;
            default:
                System.out.println("Enter the carect value");

        }
        scanner.close();

    }
}
