package Recursion;

import java.util.Scanner;

public class APowerB {
    public static int power(int a,  int b) {
        if(a == 1 || a == 0) return a;
        if(b == 0) return 1;
        if(b % 2 == 0) {
            int ans = power(a, b/2);
            return ans * ans;
        }
        int ans = power(a, (b-1)/2);
        return ans * ans * a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of base: ");
        int a = sc.nextInt();
        System.out.print("Enter the power: ");
        int b = sc.nextInt();

        int ans = power(a, b);
        System.out.println("The value of " + a + " to the power " + b + " is " + ans);
    }
}
