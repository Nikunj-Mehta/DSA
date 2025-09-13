package practice;

import java.util.Scanner;

public class MinAirPressure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean[] used = new boolean[n]; // track visited indices

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the elements of array: ");
            arr[i] = sc.nextInt();
        }

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            int maxIdx = -1;

            for (int j = 0; j < n; j++) {
                if (!used[j] && arr[j] > max) { //  pick unused max element
                    max = arr[j];
                    maxIdx = j;
                }
            }

            ans[i] = maxIdx;
            used[maxIdx] = true; //  mark as used
        }

        for (int ele : ans) {
            System.out.print(ele + " ");
        }
    }
}
