package twoDimensionalArrays;

public class MatrixMultiplication {
    public static void print(int[][] arr) {
        for(int i = 0;  i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] a = {{1, 2, 1, 1}, {2, 1, 3, 2}}; // 2*4
        int[][] b = {{1, 2, 1}, {2, 1, 2}, {3, 2, 2}, {1, 2, 2}}; // 4*3

        if(a[0].length != b.length) {
            System.out.println("Multiplication not possible"); // valid only if we take input form user.
            return;
        }
        else {
            int[][] ans = new int[a.length][b[0].length];
            for(int i = 0; i < ans.length; i++) {
                for(int j = 0; j < ans[i].length; j++) {
                    for(int k = 0; k < b.length; k++) { // or a[0].length
                        ans[i][j] += a[i][k] * b[k][j];
                    }
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
