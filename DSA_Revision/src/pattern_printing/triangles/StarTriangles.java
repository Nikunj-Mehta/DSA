package pattern_printing.triangles;

import java.util.Scanner;

public class StarTriangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt(); // rows

        for(int i = 0; i < n; i++) { // rows
            for(int j = 0; j <= i; j++) { // cols
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
