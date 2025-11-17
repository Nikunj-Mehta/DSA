package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintIncSeqOfLengthK {
    public static void subsetByMe(ArrayList<List<Integer>> ans, ArrayList<Integer> subans, int n, int k, int i) {
        if(subans.size() == k) {
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = 0; j < subans.size(); j++) {
                list.add(subans.get(j));
            }
            ans.add(list);
            return;
        }
        if(i > n) return;
        subsetByMe(ans, subans, n, k, i+1); // Don't take
        subans.add(i);
        subsetByMe(ans, subans, n ,k, i+1); // Call after Taking
        subans.removeLast(); // removeLast() undoes the previous add so each recursive path works with a correct, independent partial solution.
    }
    public static void subset(int k, String str, int i, int n) {
        if(str.length() == k) {
            System.out.println(str);
            return;
        }
        if(i > n) return;
        subset(k, str, i+1, n); // Don't take
        subset(k, str+i, i+1, n); // take
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of k(must be less than n): ");
        int k = sc.nextInt();
        ArrayList<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> subans = new ArrayList<>();
        subsetByMe(ans, subans, n, k, 1);

        for(int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
        subset(k, "", 1, n);
    }
}
