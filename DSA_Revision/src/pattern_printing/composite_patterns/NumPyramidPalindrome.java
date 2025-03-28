package pattern_printing.composite_patterns;

import java.util.Scanner;

public class NumPyramidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int i = 1; i <=n; i++) {
            for(int j = 1; j <= n-i; j++) { // spaces
                System.out.print("   ");
            }

            for(int j = 1; j <= i; j++) { // stars
                System.out.print(" " + j + " ");
            }

            for(int j = i-1; j >= 1; j--) {
                System.out.print(" " + j +  " ");
            }

            System.out.println();
        }
    }
}
