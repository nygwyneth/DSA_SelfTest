import java.util.*;

public class Permutation {
    
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        startProgram();
    }

    public static void startProgram() {
        System.out.print("Enter n: ");
        int n = in.nextInt();
        System.out.print("Enter r: ");
        int r = in.nextInt();

        int numerator = factorial(n);
        int denominator = permutation(n - r);
        int result = numerator / denominator;

        System.out.println("Result: " + result);
    }

    public static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static int permutation(int n) {
        return factorial(n);
    }
}