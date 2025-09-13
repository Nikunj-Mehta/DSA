package practice;

import java.util.Scanner;

public class MountainArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter the elements of array: ");
            arr[i] = sc.nextInt();
        }

        int peakIdx = 0;
        for(int i = 1; i < n-1; i++) {
            if(arr[i] > arr[i-1] && arr[i] > arr[i + 1]) {
                peakIdx = i;
                break;
            }
        }
        if(peakIdx == 0) {
            System.out.println("This is not a mountain array");
            return;
        }
        int i = peakIdx - 1;
        int j = peakIdx + 1;
        while(i >= 1 && arr[i] > arr[i-1]) {
            i--;
        }
        while(j < n-1 && arr[j] > arr[j+1]) {
            j++;
        }

        int sum = 0;
        for(int k = i; k <= j; k++) {
            sum += arr[k];
        }
        System.out.println(sum);
    }
}
