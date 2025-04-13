package twoDimensionalArrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle {
    public static void print(List<List<Integer>> arr) {
        for(int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        List<List<Integer>> arrayList = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            arrayList.add(new ArrayList<>());
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    arrayList.get(i).add(1);
                } else {
                    arrayList.get(i).add(arrayList.get(i-1).get(j) + arrayList.get(i-1).get(j-1));
                }
            }
        }
        print(arrayList);
    }
}
