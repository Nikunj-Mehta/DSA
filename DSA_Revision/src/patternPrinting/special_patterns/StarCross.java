package patternPrinting.special_patterns;

import java.util.Scanner;

public class StarCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { // rows
            for (int j = 1; j <= n; j++) { // columns
                if (i == j || i+j == n+1) System.out.print(" * ");
                else System.out.print("  "); // 3 spaces because if instead of " " is it was 0 then we had to write " 0 ".
            }
            System.out.println();
        }
    }
}
