package practice;

import java.util.Scanner;
import java.util.Arrays;

public class IdxAfterSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter the array elements: ");
            arr[i] = sc.nextInt();
        }

        int val = arr[0];
        Arrays.sort(arr);
        int ans = 0;
        for(int i = 0; i < n;  i++) {
            if(arr[i] == val) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
