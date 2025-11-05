package patternPrinting.special_patterns;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        int a = 1;
        for(int i = 1; i <= n; i++) { // rows
            for(int j = 1; j <= i; j++) { // columns
                System.out.print((a++) + " "); // Print first and then increment
            }
            System.out.println();
        }
    }
}
