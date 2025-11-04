package recursion;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static boolean isPrimeIterative(int n) {
        if(n <= 1) {
            return false;
        }
        if(n == 2) return true;
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeIterativeOpt(int n) {
        if(n <= 1) {
            return false;
        }
        if(n == 2) return true;

        for(int i = 2; i <= n/i; i++) { // instead of checking till n just check till under root n.
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeRecursive(int n, int i) {
        if(n <= 1) return false;
        if(n == 2) return true;
        if(n % i == 0) {
            return false;
        }
        if(i > n/i) {
            return true;
        }
        return isPrimeRecursive(n, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        boolean a =isPrimeIterative(n);
        System.out.println(a);

        boolean b = isPrimeIterativeOpt(n);
        System.out.println(b);

        boolean c =isPrimeRecursive(n, 2);
        System.out.println(c);
    }
}
