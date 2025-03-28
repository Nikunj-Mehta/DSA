package pattern_printing.special_patterns;

import java.util.Scanner;

public class StarTriangleFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

//        Method: 1
//        for(int i = 1; i <= n; i++) { // rows
//            for(int j = 1; j <= n; j++) { // columns
//                if(i+j > n) System.out.print(" * ");
//                else System.out.print("   ");
//            }
//            System.out.println();
//        }

//        Method: 2 Composite Pattern
        for(int i = 1; i <=n; i++) {
            for(int j = 1; j <=n-i; j++) {
                System.out.print("   ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
