import java.util.Scanner;

public class Q1SumOfDigitsRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        scanner.close();

        int sum = sumOfDigits(n);
        System.out.println("Sum of digits: " + sum);
    }

    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0; // Base case: if the number is 0, return 0
        }
        return (n % 10) + sumOfDigits(n / 10); // Extract the last digit and add it to the sum
    }
}
