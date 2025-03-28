package pattern_printing.composite_patterns;

import java.util.Scanner;

public class StarDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int i = 1; i <= 2*n-1; i++) {
            if(i <= 4) { // for upper triangular pyramid
                for(int j = 1; j <= n-i; j++) {
                    System.out.print("   ");
                }
                for(int j = 1; j <= 2*i - 1; j++) {
                    System.out.print(" * ");
                }
            } else { // for lower triangular pyramid
                for(int j = 1; j <= i-n; j++) {
                    System.out.print("   ");
                }
                for(int j = 1; j <= ((2*n-1) - (2*(i-n)) ); j++) { // think and you will get it.
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
