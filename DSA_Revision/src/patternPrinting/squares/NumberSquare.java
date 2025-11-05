package patternPrinting.squares;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of square: ");
        int n = sc.nextInt(); // rows == cols

        for(int i = 0; i < n; i++) { // rows
            for(int j = 1; j <= n; j++) { // cols
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
