public class Q4_RecursionProblems {

    // Factorial
    // Base case: n <= 1
    // Recursive case: n * factorial(n-1)
    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    // Fibonacci (simple recursion)
    // Base case: n <= 1
    // Recursive case: fib(n-1) + fib(n-2)
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Sum of array using recursion
    // Base case: idx == arr.length
    // Recursive case: arr[idx] + sumArray(arr, idx+1)
    public static int sumArray(int[] arr, int idx) {
        if (idx == arr.length) return 0;
        return arr[idx] + sumArray(arr, idx + 1);
    }

    // Check if array is sorted (ascending) using recursion
    // Base case: idx >= arr.length - 1
    // Recursive case: arr[idx] <= arr[idx+1] && isSorted(arr, idx+1)
    public static boolean isSorted(int[] arr, int idx) {
        if (arr.length <= 1) return true;
        if (idx >= arr.length - 1) return true;
        if (arr[idx] > arr[idx + 1]) return false;
        return isSorted(arr, idx + 1);
    }

    // Min element using recursion
    public static int minArray(int[] arr, int idx) {
        if (idx == arr.length - 1) return arr[idx];
        int minRest = minArray(arr, idx + 1);
        return (arr[idx] < minRest) ? arr[idx] : minRest;
    }

    // Max element using recursion
    public static int maxArray(int[] arr, int idx) {
        if (idx == arr.length - 1) return arr[idx];
        int maxRest = maxArray(arr, idx + 1);
        return (arr[idx] > maxRest) ? arr[idx] : maxRest;
    }
}
