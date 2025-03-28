package pattern_printing.composite_patterns;

import java.util.Scanner;

public class AlphabetTriangleFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int i = 1; i <=n; i++) {
            for(int j = 1; j <=n-i; j++) {
                System.out.print("   ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(" "+ (char) (j+64)+ " ");
            }
            System.out.println();
        }
    }
}
