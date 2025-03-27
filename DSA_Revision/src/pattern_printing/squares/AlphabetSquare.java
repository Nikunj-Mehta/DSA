package pattern_printing.squares;

import java.util.Scanner;

public class AlphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of square: ");
        int n = sc.nextInt(); // rows == cols

        for(int i = 1; i <= n; i++) { // rows
            for(int j = 1; j <= n; j++) { // cols
                System.out.print((char) (j + 64) + " "); // (j+96) if 'a b c d...'
            }
            System.out.println();
        }
    }
}
