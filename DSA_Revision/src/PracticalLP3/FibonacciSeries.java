package PracticalLP3;

import java.util.Scanner;

public class FibonacciSeries {

    // Recursive function to return nth Fibonacci number
    public static int recursiveFib(int n) { // O(2ⁿ) (exponential) SC = O(N) recursive call stack
        if (n <= 1)
            return n;
        return recursiveFib(n - 1) + recursiveFib(n - 2);
    }

    // Print Fibonacci series using recursion
    public static void printRecursiveSeries(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(recursiveFib(i) + " ");
        }
        System.out.println();
    }

    // Print Fibonacci series using iteration (efficient)
    public static void printIterativeSeries(int n) { // O(n) (linear) SC = O(1)
        int a = 0, b = 1, c;
        System.out.print(a + " ");
        if (n > 1)
            System.out.print(b + " ");
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        System.out.println("\nFibonacci Series (Iterative):");
        printIterativeSeries(n);

        System.out.println("\nFibonacci Series (Recursive):");
        printRecursiveSeries(n);

        sc.close();
    }
}
