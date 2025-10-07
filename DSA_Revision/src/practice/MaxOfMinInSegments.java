package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxOfMinInSegments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of segment: ");
        int k = sc.nextInt();
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter the elements of array: ");
            arr[i] = sc.nextInt();
        }

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i = 0; i <= n-k; i++) {
            min = Integer.MAX_VALUE;
            for(int j = i; j < i+k; j++) {
                min = Math.min(min, arr[j]);
            }
            max = Math.max(min, max);
        }

        System.out.println(max);
    }
}
