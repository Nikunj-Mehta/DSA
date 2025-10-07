package stringAndStringBuilder;

import java.util.Arrays;
import java.util.Scanner;

public class Substrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder("hello");
        char[] ch = sb.toString().toCharArray();
        Arrays.sort(ch);
        System.out.println(ch);

        for(int i = 0; i < str.length(); i++) {
            for(int j = i+1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
            System.out.println();
        }
    }
}
