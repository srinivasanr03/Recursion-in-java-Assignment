public class Q4ArraySumRecursion {
    public static void main(String[] args) {
        int[] array = {92, 23, 15, -20, 10};
        int sum = calculateArraySum(array);
        System.out.println("Sum of the values of the array: " + sum);
    }

    public static int calculateArraySum(int[] array) {
        if (array == null || array.length == 0) {
            return 0; // Base case: if the array is empty or null, return 0
        }

        return calculateArraySumRecursive(array, array.length - 1);
    }

    private static int calculateArraySumRecursive(int[] array, int endIndex) {
        if (endIndex == 0) {
            return array[0]; // Base case: if there is only one element, return it
        }

        return array[endIndex] + calculateArraySumRecursive(array, endIndex - 1); // Add current element to sum of smaller array
    }
}
