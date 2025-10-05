package recursion;

import java.util.Scanner;

public class HCFIterative {
    // Iterative
    public static int hcf(int a, int b) {
        int hcf = 1;
        for(int i = 1; i <= Math.min(a, b); i++) {
            if(a % i == 0 && b % i == 0) hcf = i;
        }
        return hcf;
    }

    // Iterative
    public static int hcfBetter(int a, int b) {
        for(int i = Math.min(a, b); i > 0; i--) { // TC = O(Math.min(a,b))
            if(a%i == 0 && b%i == 0) return i;
        }
        return 1;
    }

    // Recursive Using Long Division Method
    public static int gcd(int a, int b) {
        if(b%a == 0) return a;
        return gcd(b%a, a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second number: ");
        int b = sc.nextInt();

        int hcf = hcf(a, b);

        // optimization
        int hcfBetter = hcfBetter(a, b);
        System.out.println(hcfBetter);

        // Recursive.
        int hcfBest = gcd(a, b);
        System.out.println(hcfBest);
    }
}
