package practice;

import java.util.Arrays;
import java.util.Scanner;

public class SortWordsOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder("");
        while(i < str.length()) {
            while(j < str.length() && str.charAt(j) != ' ') j++;
            String substring = str.substring(i, j);
            char[] ch = substring.toCharArray();
            Arrays.sort(ch);
            sb.append(ch); // I can directly append char[] in a stringBuilder, for stirngs in need to do ans += new String(ch);
            sb.append(" ");
            i = j+1;
            j = i;
        }
        System.out.println(sb);
    }
}
