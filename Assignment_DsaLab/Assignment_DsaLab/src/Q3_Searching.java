public class Q3_Searching {

    // Binary Search (Iterative): Time O(log n), Space O(1)
    public static int binarySearchIterative(int[] arr, int target) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2; // avoids overflow
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) lo = mid + 1;
            else hi = mid - 1;
        }
        return -1;
    }

    // Binary Search (Recursive): Time O(log n), Space O(log n) due to recursion
    public static int binarySearchRecursive(int[] arr, int target, int lo, int hi) {
        if (lo > hi) return -1; // base case: not found

        int mid = lo + (hi - lo) / 2;
        if (arr[mid] == target) return mid;
        if (arr[mid] < target) return binarySearchRecursive(arr, target, mid + 1, hi);
        return binarySearchRecursive(arr, target, lo, mid - 1);
    }

    // Recursive Linear Search: Time O(n), Space O(n) due to recursion
    public static int linearSearchRecursive(int[] arr, int target, int idx) {
        if (idx >= arr.length) return -1; // base case
        if (arr[idx] == target) return idx;
        return linearSearchRecursive(arr, target, idx + 1);
    }

    // Find min using recursion: Time O(n), Space O(n)
    public static int findMinRecursive(int[] arr, int idx) {
        if (idx == arr.length - 1) return arr[idx]; // base case
        int minRest = findMinRecursive(arr, idx + 1);
        return (arr[idx] < minRest) ? arr[idx] : minRest;
    }

    // Find max using recursion: Time O(n), Space O(n)
    public static int findMaxRecursive(int[] arr, int idx) {
        if (idx == arr.length - 1) return arr[idx]; // base case
        int maxRest = findMaxRecursive(arr, idx + 1);
        return (arr[idx] > maxRest) ? arr[idx] : maxRest;
    }
}
