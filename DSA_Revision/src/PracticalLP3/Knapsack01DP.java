package PracticalLP3;

import java.util.Scanner;

public class Knapsack01DP {

    public static int knapSack(int W, int wt[], int val[], int n) {
        int dp[][] = new int[n + 1][W + 1];

        // Build dp[][] table
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {

                // Base case: 0 items or 0 capacity
                if (i == 0 || w == 0)
                    dp[i][w] = 0;

                    // If item weight is less than current capacity
                else if (wt[i - 1] <= w)
                    dp[i][w] = Math.max(
                            val[i - 1] + dp[i - 1][w - wt[i - 1]],
                            dp[i - 1][w]
                    );

                    // If item cannot be included
                else
                    dp[i][w] = dp[i - 1][w];
            }
        }

        return dp[n][W]; // max value
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        int val[] = new int[n];
        int wt[] = new int[n];

        System.out.println("Enter value and weight of each item:");
        for (int i = 0; i < n; i++) {
            System.out.print("Item " + (i+1) + " value: ");
            val[i] = sc.nextInt();
            System.out.print("Item " + (i+1) + " weight: ");
            wt[i] = sc.nextInt();
        }

        System.out.print("Enter knapsack capacity: ");
        int W = sc.nextInt();

        System.out.println("\nMaximum Profit = " + knapSack(W, wt, val, n));

        sc.close();
    }
}