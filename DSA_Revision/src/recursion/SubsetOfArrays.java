package recursion;

import java.util.Scanner;

public class SubsetOfArrays {
    public static void subset(int[] arr, String str, int i) {
        if(i == arr.length) {
            System.out.println(str);
            return;
        }
        subset(arr, str, i+1);
        str += arr[i];
        subset(arr, str, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter array elements: ");
            arr[i] = sc.nextInt();
        }
        subset(arr, "", 0);
    }
}
