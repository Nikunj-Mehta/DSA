package pattern_printing.composite_patterns;

import java.util.Scanner;

public class StarBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int i = 1; i <= 2*n-1; i++) {
            System.out.print(" * ");
        }
        System.out.println();

        for(int i = 1; i <= n-1; i++) {
            for(int j = 1; j <= n-i; j++) { // stars
                System.out.print(" * ");
            }

            for(int j = 1; j <= 2*i-1; j++) { // spaces
                System.out.print("   ");
            }

            for(int j = 1; j <= n-i; j++) { // stars
                System.out.print(" * ");
            }

            System.out.println();
        }
    }
}
