import java.util.Scanner;

public class Q5ArmstrongNumberRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        boolean isArmstrong = isArmstrongNumber(n);
        if (isArmstrong) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isArmstrongNumber(int n) {
        int numDigits = countDigits(n);
        int sum = calculateSumOfDigitsRaisedToPower(n, numDigits);
        return sum == n;
    }

    public static int countDigits(int n) {
        if (n == 0) {
            return 0; // Base case: if n is 0, it has 0 digits
        }
        return 1 + countDigits(n / 10); // Recursive call: divide n by 10 to remove the last digit
    }

    public static int calculateSumOfDigitsRaisedToPower(int n, int numDigits) {
        if (n == 0) {
            return 0; // Base case: if n is 0, sum of digits raised to power is 0
        }
        int digit = n % 10; // Extract the last digit
        return (int) Math.pow(digit, numDigits) + calculateSumOfDigitsRaisedToPower(n / 10, numDigits);
        // Recursive call: divide n by 10 to remove the last digit
    }
}
