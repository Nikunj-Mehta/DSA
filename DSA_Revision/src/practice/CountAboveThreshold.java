package practice;

import java.util.Scanner;

public class CountAboveThreshold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter the elements: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the threshold value: ");
        int threshold = sc.nextInt();

        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] > threshold) count ++;
        }
        System.out.println(count);
    }
}
