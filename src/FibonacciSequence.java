import java.util.*;

public class FibonacciSequence {
    
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        startProgram();
    }

    public static void startProgram() {
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        System.out.println("\nFirst " + n + " Fibonacci number(s):");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if ((n == 1) || (n == 2)) return 1; 
        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}