public class Lesson_2 {
    public static void main(String[] args) {
        // towerOfHanoi();
        // startRecursiveLS();
        // startRecursiveBS();
        // startTailRecursive();
        startTRMaxNum();
    }

    // TOWER OF HANOI
    public static void towerOfHanoi() {
        System.out.println(moves(3, 'A', 'B', 'C'));
    }

    public static String moves(int n, char s, char e, char t) {
        if (n == 1) return "Transfer disk 1 from " + s + " to " + t;
        return moves(n - 1, s, t, e) + "\nTransfer disk " + n + " from " + s + " to " + t + "\n" 
                + moves(n - 1, e, s, t);
    }

    // RECURSIVE LINEAR SEARCH
    public static void startRecursiveLS() {
        Integer arr[] = {9, 11, 21, 5, 18, 17};
        int n = 15;
        int result = recursiveLS(arr, n);

        if (result == -1) System.out.println("Element " + n + " is not in the list");
        else System.out.println("Element " + n + " is in index " + result);
    }

    public static int recursiveLS(Integer arr[], int n) {
        return recursiveLS(arr, 0, n);
    }
    
    public static int recursiveLS(Integer arr[], int i, int n) {
        if (i == arr.length) return -1;

        if (arr[i].equals(n)) return i;

        return recursiveLS(arr, i + 1, n);
    }

    // RECURSIVE BINARY SEARCH
    public static void startRecursiveBS() {
        Integer arr[] = {9, 11, 21, 5, 18, 17};
        int n = 28;
        int result = recursiveBS(arr, n);

        if (result == -1) System.out.println("Element " + n + " is not in the list");
        else System.out.println("Element " + n + " is in index " + result);
    }

    public static int recursiveBS(Integer arr[], int n) {
        return recursiveBS(arr, 0, arr.length - 1, n);
    }

    public static int recursiveBS(Integer arr[], int low, int hi, int n) {
        int mid = low + (hi - low) / 2;
        if (low > hi) return -1;

        if (arr[mid] == n) return mid;
        else if (arr[mid] > 0) return recursiveBS(arr, low, mid - 1, n);
        else return recursiveBS(arr, mid + 1, hi, n);
    }

    // TAIL RECURSION
    public static void startTailRecursive() {
        int n = 5;
        System.out.println("Factorial of " + n + ": " + factorial(n));
    }

    public static int factorial(int n) {
        return factorial(n, 1);
    }

    public static int factorial(int n, int p) {
        if (n == 1) return p;
        return factorial(n - 1, n * p);
    }

    // SELF TEST 1: Implement a tail recursive function that returns the maximum element in the array 𝐴.
    public static void startTRMaxNum() {
        
    }
    
    public static void maxNum(Integer Array[]) {
        
    }

    public static void maxNum(Integer Array[], int k) {
        
    }
}