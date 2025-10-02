package striversSDESheet;

import java.util.Arrays;

public class SetRowAndColToZero {
    public static void setRowZero(int[] arr) {
//        for(int i = 0; i < arr.length; i++) {
//            arr[i] = 0;
//        }
        Arrays.fill(arr, 0);
    }

    public static void setColZero(int[][] arr, int col) {
        for(int i = 0; i < arr.length; i++) {
            arr[i][col] = 0;
        }
    }
    public static void setZeroes(int[][] matrix) {
        // Approach 1: Create a copy of matrix and traverse the original one and set row and column of original to zero when traversing duplicate.
        int[][] helper = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < helper.length; i++) {
            for(int j = 0; j < helper[0].length; j++) {
                helper[i][j] = matrix[i][j];
            }
        }

        for(int i = 0; i < helper.length; i++) {
            for(int j = 0; j < helper[0].length; j++) {
                if(helper[i][j] == 0) {
                    setRowZero(matrix[i]); // the row can be sent this way
                    setColZero(matrix, j); // But for column we need to send j as it is not continuous in memory
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setZeroes(matrix);
        for(int[] row : matrix) {
            for(int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}