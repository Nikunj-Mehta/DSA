package stringAndStringBuilder;

import java.util.Scanner;

public class ReverseEachWordInSentence {
    public static void reverse(StringBuilder sb, int i, int j) {
        while(i <= j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());

        int i = 0, j = 0, n = sb.length() - 1;

        while(j <= n) {
            if(sb.charAt(j) != ' ') j++;
            else {
                reverse(sb, i, j - 1);
                i = j + 1;
                j = i;
            }
        }
        reverse(sb, i, j-1); // to reverse the last word.
        System.out.println(sb);
    }
}
