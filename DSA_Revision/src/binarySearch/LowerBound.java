package binarySearch;

import java.util.Scanner;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 30, 40, 50, 60, 70};

        int n = arr.length;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int tgt = sc.nextInt();

        int lb = n;

        int lo = 0;
        int hi = n-1;
        while(lo <= hi) {
            int mid = lo + (hi - lo)/2;

            if(arr[mid] >= tgt) { // Same as upper bound just arr[mid] > tgt there
                lb = Math.min(lb, mid);
                hi = mid - 1;
            }
            else lo = mid + 1;
        }
        System.out.println("Lower bound: " + lb);
    }
}
