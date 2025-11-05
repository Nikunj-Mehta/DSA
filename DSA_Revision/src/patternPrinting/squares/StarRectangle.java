package patternPrinting.squares;

import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt(); // rows

        System.out.print("Enter number of columns: ");
        int n = sc.nextInt(); // columns

        for(int i = 0; i < m; i++) { // rows
            for(int j = 0; j < n; j++) { // cols
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
