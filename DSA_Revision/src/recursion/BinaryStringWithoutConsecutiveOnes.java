package recursion;

import java.util.Scanner;

public class BinaryStringWithoutConsecutiveOnes {
    public static void printStringWithoutConsecutiveOnes(int n, String ans) {
        if(ans.length() == n) {
            System.out.println(ans);
            return;
        }
        if(!ans.isEmpty() && ans.charAt(ans.length()-1) == '1') printStringWithoutConsecutiveOnes(n, ans+0);
        else {
            printStringWithoutConsecutiveOnes(n, ans+1);
            printStringWithoutConsecutiveOnes(n, ans+0);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of elements: ");
        int n = sc.nextInt();
        printStringWithoutConsecutiveOnes(n, "");
    }
}
