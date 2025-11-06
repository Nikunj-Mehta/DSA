package PracticalLP3;

import java.util.Scanner;

public class NQueens {

    static int N;
    static int board[][];

    // Function to print the board
    static void printBoard() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Check if queen can be placed at board[row][col]
    // Check entire column and both diagonals (both directions)
    static boolean isSafe(int row, int col) {
        // same column (all rows)
        for (int i = 0; i < N; i++) {
            if (i != row && board[i][col] == 1) return false;
        }

        // main diagonal (\): check both up-left and down-right
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) return false;
        }
        for (int i = row + 1, j = col + 1; i < N && j < N; i++, j++) {
            if (board[i][j] == 1) return false;
        }

        // anti-diagonal (/): check both up-right and down-left
        for (int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++) {
            if (board[i][j] == 1) return false;
        }
        for (int i = row + 1, j = col - 1; i < N && j >= 0; i++, j--) {
            if (board[i][j] == 1) return false;
        }

        return true;
    }

    // Backtracking function
    static boolean solve(int row) {
        if (row == N)   // all queens placed
            return true;

        // If this row already has the fixed queen, skip it
        for (int col = 0; col < N; col++) {
            if (board[row][col] == 1)      // already placed
                return solve(row + 1);
        }

        // Try placing queen in each column
        for (int col = 0; col < N; col++) {
            if (isSafe(row, col)) {
                board[row][col] = 1;   // place queen

                if (solve(row + 1))    // recursive call
                    return true;

                board[row][col] = 0;   // backtrack
            }
        }

        return false;   // no solution
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        N = sc.nextInt();

        board = new int[N][N];

        System.out.print("Enter position of first queen (row col): ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        board[r][c] = 1;   // first queen already placed

        if (solve(0)) {
            System.out.println("\nSolution:");
            printBoard();
        } else {
            System.out.println("No solution exists.");
        }

        sc.close();
    }
}

/* Algorithm Explanation (Backtracking)
Place first queen at user-given position.

Start from row 0 → move row by row.

For each row, try placing queen in each column:

Check if safe using isSafe()

If safe → place queen → move to next row

If not safe → try next column

If no column works → backtrack

When row == n → solution found
*/
