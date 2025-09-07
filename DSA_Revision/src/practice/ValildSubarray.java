package practice;

import java.util.Scanner;

public class ValildSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int n = sc.nextInt();
        int[] arr = new int [n];
        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter the elements of array: ");
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int j = i + 2;
        int total = 0;
        while(j < arr.length) {
            if(arr[i] + arr[j] == arr[i+1]) {
                total++;
            }
            i++;
            j++;
        }
        System.out.println(total);
    }
}
