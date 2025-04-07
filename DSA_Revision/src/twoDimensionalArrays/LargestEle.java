package twoDimensionalArrays;

public class LargestEle {
    public static void main(String[] args) {
        int[][] arr = {{10, 30, 58, 29}, {29, 59, 28, 24, 30}, {20, 30, 80, 60, 52}, {42, 60, 40, 90, 50}};
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                max = Math.max(max, arr[i][j]);
                sum += arr[i][j];
            }
        }

        System.out.println("The maximum number in this 2D array is: " + max);
        System.out.println("The sum of this 2D array is: " + sum);
    }
}
