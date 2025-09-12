package practice;

import java.util.Scanner;

public class NumberOfSegments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter the elements: ");
            arr[i] = sc.nextInt();
        }

        int change = arr[0];
        int segments = 1;
        for(int i = 0; i < n; i++) {
            if(change < 0 && arr[i] >= 0) segments++;
            else if(change >= 0 && arr[i] < 0) segments++;
            change = arr[i];
        }
        System.out.println("No of segments are: " + segments);
    }
}
