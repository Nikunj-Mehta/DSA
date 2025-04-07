package twoDimensionalArrays;

public class TransposeOfMatrix { // col wise printing.
    public static void swap(int[][] arr, int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    public static void main(String[] args) {
     int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

     int[][] transpose = new int[arr[0].length][arr.length];

     for(int j = 0; j < arr[0].length; j++) {
         for(int i = 0; i < arr.length; i++) {
             transpose[j][i] = arr[i][j];
             System.out.print(transpose[j][i] + " ");
         }
         System.out.println();
     }
    }
}
