package recursion;

import java.util.Scanner;

public class PrintNTo1 {
    public static void printDecreasing(int n) {
        if(n == 0) return;
        System.out.print(n + " "); // Just swap these two lines and we can printIncreasing // Work
        printDecreasing(n-1); // Call
    }

    public static void printIncreasing(int n) {
        if(n == 0) return;
        printIncreasing(n-1); // Call
        System.out.print(n + " "); // Work
    }

    public static void printInc(int x, int n) { // Extra parameter
        if(x > n) return;
        System.out.print(x + " ");
        printInc(x+1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        printDecreasing(n);
        System.out.println();
        printIncreasing(n);
        System.out.println();
        printInc(1, n);
    }
}
