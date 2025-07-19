package binarySearch;

import java.util.Scanner;

public class UpperBound {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 30, 40, 50, 60, 70};

        int n = arr.length;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int tgt = sc.nextInt();

        int ub = n;

        int lo = 0;
        int hi = n-1;
        while(lo <= hi) {
            int mid = lo + (hi - lo)/2;

            if(arr[mid] > tgt) { // Same as lower bound just arr[mid] >= tgt there
                ub = Math.min(ub, mid);
                hi = mid - 1;
            }
            else lo = mid + 1;
        }
        System.out.println("Upper bound: " + ub);
    }
}
