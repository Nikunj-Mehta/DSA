package practice;

import java.util.Scanner;
import java.time.LocalDate;

public class MinHopValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter the elements of array: ");
            arr[i] = sc.nextInt();
        }
        int hop = 1;
        int j = 0;
        while(j < arr.length) {
            if(j + hop < arr.length) j = j + hop;
            else break;
            if(arr[j] % 2 != 0) {
                hop++;
                j = 0;
            }
        }
        System.out.println("hop = " + hop);
    }
}
