package stringAndStringBuilder;

import java.util.Scanner;

public class MaxValue2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of string array: ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter the string value at index " + (i + 1) +": ");
            arr[i] = sc.next();
        }

        String max = arr[0]; // for string length
        for(int i = 0; i < arr.length; i++) {
            String curr = arr[i];
            if(curr.startsWith("0")) {
                while(curr.startsWith("0")) {
                    curr = curr.substring(1); // removes leading zero
                }
            }
            // If the current string is greater than the max string, update max and maxIndex
            if (curr.length() > max.length() || (curr.length() == max.length() && curr.compareTo(max) > 0)) {
                max = curr;
            }
        }
        System.out.println(max);
    }
}
