package pattern_printing.triangles;

import java.util.Scanner;

public class ReversedStarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt(); // rows

        for(int i = 1; i <= n; i++) { // rows
            for(int j = 1; j <= (n+1-i); j++) { // cols also (int j = i; j <= n; j++)
                System.out.print((char) (i+64) + "  " );
            }
            System.out.println();
        }

//        for(int i = 1; i <= n; i++) { // rows
//            for(int j = i; j <= n; j++) { // cols
//                System.out.print((j-i+1) + "  " );
//            }
//            System.out.println();
//        }
    }
}