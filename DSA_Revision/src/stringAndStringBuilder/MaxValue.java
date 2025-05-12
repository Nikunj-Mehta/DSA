package stringAndStringBuilder;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        System.out.print("Enter the size of string array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Enter the string for index " + (i+1) + ": ");
            arr[i] = sc.next();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            int curr = Integer.parseInt(arr[i]); // Converting string to number
            max = Math.max(curr, max);
            min = Math.min(curr, min);
        }

        System.out.println(max);
        System.out.println(min);
    }
}
