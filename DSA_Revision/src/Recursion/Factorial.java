package Recursion;

import java.util.Scanner;

public class Factorial {
    public static int fact(int n) {
        if(n == 1 || n == 0) return 1; // Base Case.
        int ans = n * fact(n-1);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

//        int Factorial = 1;
//        for(int i = 1; i <= n; i++) {
//            Factorial *= i;
//        }

        int factorial = fact(n);
        System.out.println("The Factorial of " + n + " is: " + factorial);
    }
}
