package twoDimensionalArrays;

public class AddTwoMatrices {
    public static void main(String[] args) {
        int[][] arr = {{10, 29, 50}, {21, 53, 75}, {23, 70, 56}, {2, 35, 70}};
        int[][] brr = {{13, 35, 35}, {24, 64, 24}, {63, 68, 36}, {46, 86, 85}};

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = arr[i][j] + brr[i][j];
            }
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
