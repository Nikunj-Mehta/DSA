package practice;

import java.util.Scanner;

public class TrapeziumUsingStarsAndDots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        for(int i = 1; i <= 2*n - 1; i++) { // Rows
            int row = i <= n ? i : 2*n - i;

            for(int j = 1; j <= n-row; j++) { // Star triangle
                System.out.print(" * ");
            }
            for(int j = 1; j <= 2*row - 1; j++) { // Dot pattern
                System.out.print(" . ");
            }
            for(int j = 1; j <= n-row; j++) { // Star triangle
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
