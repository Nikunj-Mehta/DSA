package arrays;

import java.util.Scanner;

public class Reverse {
    // Function to swap elements of array.
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
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
        System.out.println("Elements of array without swapping are: ");
        for(int ele: arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        // Code for reverse an array.
        int i = 0;
        int j = arr.length - 1;
        while(i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
        System.out.println("After swapping:");
        for(int ele: arr) {
            System.out.print(ele + " ");
        }
    }
}
