package twoDimensionalArrays;

import java.util.Scanner;

public class PascalsTriangle {
    public static void print(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        if(n <= 0) {
            System.out.println("Enter a number greater than 0.");
            return;
        }

        int[][] arr = new int[n][];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = new int[i+1]; // Created an array of i+1 size;
            arr[i][0] = arr[i][i] = 1; // first and last element intitalized by 1;

            for(int j = 1; j < i; j++) {
                arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
            }
        }
        print(arr);
    }
}
