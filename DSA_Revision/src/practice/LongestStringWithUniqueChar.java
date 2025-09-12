package practice;

import java.util.Scanner;
import java.util.Arrays;

public class LongestStringWithUniqueChar {
    public static String getUnique(String str) {
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        int i = 0;
        int j = 0;
        StringBuilder ans = new StringBuilder();
        while(j < ch.length) {
            if(ch[j] == ch[i]) {
                j++;
            }
            else {
                ans.append(ch[i]);
                i = j;
                j = i + 1;
            }
        }
        if(ans.charAt(ans.length() - 1) == ch[ch.length - 1]) return ans.toString();
        else {
            ans.append(ch[ch.length - 1]);
            return ans.toString();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of Strings: ");
        int n = sc.nextInt();
        String[] str = new String[n];
        sc.nextLine();
        for(int i = 0; i < n; i++) {
            System.out.print("Enter the words: ");
            str[i] = sc.nextLine();
        }

        int maxLen = 0;
        int maxIdx = 0;
        for(int i = 0; i < str.length; i++) {
            if(str[i].length() > maxLen) {
                maxLen = str[i].length();
                maxIdx = i;
            }
        }
        String unique = getUnique(str[maxIdx]);
        System.out.println(unique);
    }
}
