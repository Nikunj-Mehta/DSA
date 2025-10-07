package practice;

import java.util.Scanner;

public class FormattingLargeProducts {
    public static int factorial(int A, int B) {
        if(B == A) return A;
        return B * factorial(A, B-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int A = sc.nextInt();
        System.out.print("Enter B: ");
        int B = sc.nextInt();

        int product = factorial(A, B);
        int noOfZeroes = 0;
        while(product%10 == 0) {
            noOfZeroes++;
            product /= 10;
        }

        System.out.println(product + " * 10 ^ " + noOfZeroes);
    }
}
