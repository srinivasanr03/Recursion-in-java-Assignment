import java.util.Scanner;

public class Q2AlternateSumRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();
        scanner.close();

        int sum = alternateSum(n);
        System.out.println("Output: " + sum);
    }

    public static int alternateSum(int n) {
        if (n == 0) {
            return 0; // Base case: return 0 if n is 0
        } else if (n % 2 == 0) {
            return alternateSum(n - 1) - n; // Subtract if n is even
        } else {
            return alternateSum(n - 1) + n; // Add if n is odd
        }
    }
}
