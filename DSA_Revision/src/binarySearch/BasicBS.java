package binarySearch;

import java.util.Scanner;

public class BasicBS {
    public static void print(int[] arr) {
        for(int ele: arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 23, 46, 57, 68, 79, 89, 90, 101};

        int lo = 0;
        int hi = arr.length-1;
        boolean flag = false;

        print(arr);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value to be searched in array: ");
        int target = sc.nextInt();
        while(lo <= hi) {
            int mid = (hi+lo)/2;
            if(arr[mid] == target) {
                System.out.println("Element " + target + " found at index: " + mid);
                return;
            }
            else if (target > arr[mid]) lo = mid + 1;
            else hi = mid - 1; // target < arr[mid]
        }
        if(!flag) {
            System.out.print("Element not present in array.");
        }
    }
}
