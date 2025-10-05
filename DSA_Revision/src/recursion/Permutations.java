package recursion;

import java.util.Scanner;

public class Permutations {
    public static void permutation(String ans, String str) {
        if(str.isEmpty()) { // str.length() == 0 will also work.
            System.out.println(ans);
            return;
        }
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String leftPart = str.substring(0,i); // will give substring from 0 to i-1 .substring takes 1 element less that last index.
            String rightPart = str.substring(i+1) ; // from i+1 to end
            permutation(ans+ch, leftPart+rightPart);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        permutation("", str);
    }
}