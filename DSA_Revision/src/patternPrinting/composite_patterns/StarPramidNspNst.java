package patternPrinting.composite_patterns;

import java.util.Scanner;

public class StarPramidNspNst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        int nsp = n - 1;
        int nst = 1;

        for(int i = 1; i <=n; i++) {
            for(int j = 1; j <= nsp; j++) { // spaces
                System.out.print("   ");
            }

            for(int j = 1; j <= nst; j++) { // stars
                System.out.print(" * ");
            }

            System.out.println();
            nsp--;
            nst += 2;
        }
    }
}
