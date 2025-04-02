package arrays;

import java.util.Scanner;

public class RotateWithoutExtraArray {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr, int i, int j) {
        while(i <= j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        if(k > n) k = k %n;

        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);

        for(int ele: arr) {
            System.out.print(ele + " ");
        }
    }
}
