package twoDimensionalArrays;

public class PrintSpiral {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}, {26, 27, 28, 29, 30}};

        int minr = 0, maxr = arr.length-1, minc = 0, maxc = arr[0].length-1;

        while(minr <= maxr && minc <= maxc) {
            // left to right
            for(int j = minc; j <= maxc; j++) { // column
                System.out.print(arr[minr][j] + " ");
            }
            System.out.print(" ");
            minr++;
            if(minr > maxr) break; // needed because I am incrementing minr.
            // top to bottom
            for(int i = minr; i <= maxr; i++) { // row
                System.out.print(arr[i][maxc] + " ");
            }
            System.out.print(" ");
            maxc--;
            if(minc > maxc) break;
            // right to left
            for(int j = maxc; j >= minc; j--) {
                System.out.print(arr[maxr][j] + " ");
            }
            System.out.print(" ");
            maxr--;
            if(minr > maxr) break;
            // bottom to top
            for(int i = maxr; i >= minr; i--) {
                System.out.print(arr[i][minc] + " ");
            }
            System.out.print(" ");
            minc++;
        }
    }
}
