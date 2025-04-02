package arrays;

import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take size of array as input
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // Take the array elements as input
        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + i + "th element of array: ");
            arr[i] = sc.nextInt();
        }
        // Print the array elements
        System.out.print("Initial array: ");
        for(int ele: arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        int[] rotatedArr = new int[n];
        System.out.print("Enter the value of K: ");
        int k = sc.nextInt();

        if(k > n) k = k % n;

        // We will rotate the array in 2 parts
        int i = 0;
        int j = k;

        // First in new array from k to end;
        while(j < n) { // or i < k
            rotatedArr[j] = arr[i];
            i++;
            j++;
        }

        // Now from 0th index to k
        i = n - k;
        j = 0;
        while(j < k) { // or i < n;
            rotatedArr[j] = arr[i];
            i++;
            j++;
        }
        System.out.print("Array after rotation: ");

        for(int ele: rotatedArr)
        {
            System.out.print(ele + " ");
        }
    }
}
