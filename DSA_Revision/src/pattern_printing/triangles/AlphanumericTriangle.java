package pattern_printing.triangles;

import java.util.Scanner;

public class AlphanumericTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt(); // rows

        for(int i = 1; i <= n; i++) { // rows
            for(int j = 1; j <= i; j++) { // cols
                if(i % 2 == 0) System.out.print((char) (j+64) + " " );
                else System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
