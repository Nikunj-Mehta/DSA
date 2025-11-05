package patternPrinting.triangles;

import java.util.Scanner;

public class AlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt(); // rows

        for(int i = 1; i <= n; i++) { // rows
            for(int j = 1; j <= i; j++) { // cols
                System.out.print((char) (j+64) + " " );
            }
            System.out.println();
        }
    }
}
