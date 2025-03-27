package pattern_printing.squares;

import java.util.Scanner;

public class StarSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of square: ");
        int n = sc.nextInt(); // rows == columns

        for(int i = 0; i < n; i++) { // rows
            for(int j = 0; j < n; j++) { // cols
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
