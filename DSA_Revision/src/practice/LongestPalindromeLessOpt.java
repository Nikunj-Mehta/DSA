package practice;

import java.util.Scanner;

public class LongestPalindromeLessOpt {
    // Tried to create an optimised approach for this so that there is no need to check same string no of times.
    public static boolean isPalindrome(StringBuilder sb) {
        int i = 0;
        int j = sb.length() - 1;
        while(i <= j) {
            if(sb.charAt(i) != sb.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static String longestPalindrome(String s) {
        String ans = "";
        for(int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder("");
            for(int j = i; j < s.length(); j++) {
                sb.append(s.charAt(j));
                if(isPalindrome(sb)) {
                    if(sb.length() > ans.length()) ans = new String(sb);
                }
            }
        }
        return ans;
    }

    public static String expand(String s, int i, int j) {
        while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        // As substring starts from i and goes till j-1
        return s.substring(i+1, j);
    }

    public static String longestPalindrome2(String s) {
        String ans = "";
        for(int i = 0; i < s.length(); i++) {
            String odd = expand(s, i, i); // For odd length string
            String even = expand(s, i, i+1); // For even length string
            String longer = odd.length() > even.length() ? odd : even;
            if(longer.length() > ans.length()) ans = longer;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to check: ");
        String str = sc.nextLine();
        String ans = longestPalindrome(str);
        System.out.println(ans);
        String optimisedAns = longestPalindrome2(str);
        System.out.println(optimisedAns);
    }
}
