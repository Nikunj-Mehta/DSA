package recursion;

import java.util.Scanner;

public class StairPath {
//    public static int stair(int n, int ans) {
//        if(n == 0 || n-1 == 0) return ans+1;
//        return stair(n-1, ans) + stair(n-2, ans);
//    }

    // The code is same as fibonacci (fibonacci series with first index as fibo(11) == stair(10) = 89
    public static int stair(int n) {
        if(n <= 2) return n; // if n == 1 only 1 way if n == 2, 2 ways 1,1 or direct 2 steps.
        return stair(n-1) + stair(n - 2);
    }

    // One jump of 3 or single jumps.
    public static int stair2(int n) {
//      if(n == 0 || n-1 == 0 || n-2 == 0) return 1;
        if(n < 3 ) return 1; // replacement of line above but the above line is kept to understand why it is done.
        if(n == 3) return 2; // Two ways to reach the ground

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