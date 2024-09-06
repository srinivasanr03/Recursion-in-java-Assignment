public class Q3MaxValueOfArrayRecursion {
    public static void main(String[] args) {
        int[] array = {13, 1, -3, 22, 5};
        int maxValue = findMaxValue(array);
        System.out.println("Max value of the array: " + maxValue);
    }

    public static int findMaxValue(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        return findMaxValueRecursive(array, array.length - 1);
    }

    private static int findMaxValueRecursive(int[] array, int endIndex) {
        if (endIndex == 0) {
            return array[0]; // Base case: if there is only one element, return it
        }

        int maxOfSmallerArray = findMaxValueRecursive(array, endIndex - 1); // Recursively find max of smaller array
        return Math.max(maxOfSmallerArray, array[endIndex]); // Compare max of smaller array with current element
    }
}
