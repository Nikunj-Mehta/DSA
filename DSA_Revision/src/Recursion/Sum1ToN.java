package Recursion;

import java.util.Scanner;

public class Sum1ToN {
    public static int sumUsingParameter(int x, int n, int sum){
        if(x > n) return sum;
        return sumUsingParameter(x+1, n, sum + x);
    }
    public static int sum(int n, int sum) {
        if(n == 0) return sum;
        return sum(n-1, sum + n);
    }
    public static int sumOptimised(int n) {
        if(n == 1 || n == 0) return n;
        return n + sumOptimised(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int ans = sumUsingParameter(1, n, 0);
        System.out.println(ans);

        int sol = sum(n , 0);
        System.out.println(sol);

        int answer = sumOptimised(n);
        System.out.println(answer);
    }
}