package Recursion;

import java.util.Scanner;

public class MazePath {
    public static int maze(int startx, int starty, int endx, int endy) {
        if(startx == endx || starty == endy) return 1;
//        if(startx == endx && starty == endy) return 1; // In this case the bottom code will be required
//        if(startx > endx || starty > endy) return 0; // This condition will never come
        int rightWays = maze(startx, starty + 1, endx, endy);
        int downWays = maze(startx + 1, starty, endx, endy);
        return rightWays + downWays;
    }
    public static int mazeOpt(int endx, int endy) {
        if(endx == 1 || endy == 1) return 1;

        int topways = mazeOpt(endx - 1, endy);
        int leftways = mazeOpt(endx, endy - 1);
        return topways + leftways;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter no. of columns: ");
        int m = sc.nextInt();

        int ways = maze(1, 1, n, m);
        System.out.println(ways);
        int waysOpt = mazeOpt(n, m);
        System.out.println(waysOpt);
    }
}
