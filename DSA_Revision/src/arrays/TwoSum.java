package arrays;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + i + "th element of array: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements of array are: ");
        for(int ele: arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr[i] + arr[j] == x) System.out.println("The two indices are: " + i + " and " + j);
            }
        }
    }
}
