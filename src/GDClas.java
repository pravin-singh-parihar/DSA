import java.util.Scanner;

public class GDClas{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate GCD using the Euclidean algorithm
        int gcd = findGCD(num1, num2);

        // Display the result
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);

        scanner.close();
    }

    // Method to find GCD using Euclidean algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

