package twoDimensionalArrays;

public class DiagonalPrinting {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {6, 7}, {11, 12}, {16, 17}};

        int i = 0, j = 0, a = 1;
        int row = arr.length;
        int col = arr[0].length;

        for(int k = 0; k < row; k++) {
            i = k;
            j = 0;
            while(i >= 0 && j < col) {
                System.out.print(arr[i][j] + " ");
                i--; j++;
            }
            System.out.println();
        }

        for(int k = 1; k < col; k++) {
            i = row - 1;
            j = k;
            while(i >= 0 && j < col) {
                System.out.print(arr[i][j] + " ");
                i--; j++;
            }
            System.out.println();
        }
    }
}
