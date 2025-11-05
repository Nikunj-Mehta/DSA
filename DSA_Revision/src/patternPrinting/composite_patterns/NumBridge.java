package patternPrinting.composite_patterns;

import java.util.Scanner;

public class NumBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int i = 1; i <= 2*n-1; i++) {
            System.out.print(" " + i + " ");
        }
        System.out.println();

//        for(int i = 1; i <= n-1; i++) {
//            for(int j = 1; j <= n-i; j++) { // stars
//                System.out.print(" " + j + " ");
//            }
//
//            for(int j = 1; j <= 2*i-1; j++) { // spaces
//                System.out.print("   ");
//            }
//
//            for(int j = ((2*n) - (n-i)); j <= 2*n-1; j++) { // stars
//                System.out.print(" " + j +" ");
//            }
//
//            System.out.println();
//        }

//        Method: 2 using a variable

        for(int i = 1; i <= n-1; i++) {
            int a = 1;
            for(int j = 1; j <= n-i; j++) { // stars
                System.out.print(" " + a++ + " ");
            }

            for(int j = 1; j <= 2*i-1; j++) { // spaces
                System.out.print("   ");
                a++; // not printing but incrementing so that we get the req value when we print.
            }

            for(int j = 1; j <= n-i; j++) { // stars
                System.out.print(" " + a++ + " ");
            }

            System.out.println();
        }
    }
}
