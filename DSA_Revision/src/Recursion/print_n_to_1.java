package Recursion;

import java.util.Scanner;

public class print_n_to_1 {
    public static void print(int n) {
        if(n == 0) return;

        print(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        print(n);
    }
}
