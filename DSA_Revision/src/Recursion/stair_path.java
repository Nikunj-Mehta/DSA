package Recursion;

import java.util.Scanner;

public class stair_path {
//    public static int stair(int n, int ans) {
//        if(n == 0 || n-1 == 0) return ans+1;
//        return stair(n-1, ans) + stair(n-2, ans);
//    }

    // The code is same as fibonacci (fibonacci series with first index as fibo(11) == stair(10) = 89
    public static int stair(int n) {
        if(n <= 2) return n; // if n == 1 only 1 way if n == 2 2 ways 1,1 or 2s teps.
        return stair(n-1) + stair(n - 2);
    }

    public static int stair2(int n) {
        if(n == 0 || n-1 == 0 || n-2 == 0) return 1;
        if(n-3 == 0) return 2; // Two ways to reach the ground
//        Easy test cases.
//        if (n == 0) return 1;   // reached ground
//        if (n < 0) return 0;    // invalid path
        return stair2(n-1) + stair2(n-3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
//        int ans = stair(n, 0);
        int ans = stair(n);
        int ans2 = stair2(n);
        System.out.println(ans);
        System.out.println(ans2);
    }
}
