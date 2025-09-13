package practice;

import java.util.Scanner;

public class HarvestTimeCalculator {

    public static int totalHarvestTime(int N, int[] A, int[] B, int S) {
        int totalTime = 0;

        for(int i = 0; i < N; i++) {
            totalTime = totalTime + A[i] + i;
            if(i > 0 && B[i-1] != B[i]) {
                totalTime += S;
            }
        }
        return totalTime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the size of array: ");
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Enter the elements of array A: ");
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            System.out.print("Enter the elements of array B: ");
            B[i] = sc.nextInt();
        }

        System.out.print("Enter the penalty: ");
        int S = sc.nextInt();

        // Function call
        int result = totalHarvestTime(N, A, B, S);

        // Output
        System.out.println(result);

        sc.close();
    }
}
