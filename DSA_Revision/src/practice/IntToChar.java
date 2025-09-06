package practice;

import java.util.Scanner;

public class IntToChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter the number: ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " - "+ (char)arr[i]);
        }
    }
}
