package twoDimensionalArrays;

public class PrintMatrixInWaveform {

//    public static void reverse(int[] arr) { // this fn takes 1-D array ie arr[i].
//        int i = 0, j = arr.length - 1;
//
//        while(i < j) {
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//
//            i++;
//            j--;
//        }
//    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};

        for(int i = 0; i < arr[0].length; i++) { // this is columwise waveform printing. If you need row wise replace arr[0].length by arr.length
            if(i % 2 == 0) {
                for(int j = 0; j < arr.length; j++) { // and arr.length by arr[0].length
                    System.out.print(arr[j][i] + " "); // and arr[j][i] by arr[i][j]
                }
            } else {
                for(int j = arr.length-1; j >= 0; j--) { // and arr.length by arr[0].length
                    System.out.print(arr[j][i] + " "); // and arr[j][i] by arr[i][j]
                }
            }
            System.out.print(" ");
        }

    }
}
