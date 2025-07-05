package stringAndStringBuilder;

import java.util.Arrays;
import java.util.Scanner;

public class MostOccurringChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] ch = str.toCharArray();
        Arrays.sort(ch);

        int max = Integer.MIN_VALUE;
        int curr = 1;
        char maxChar = ' ';
        int i = 0, n = ch.length;
        while(i < n-1) {
            if(ch[i] == ch[i+1]){
                curr++;
                if(max <= curr) {
                    max = curr;
                    maxChar = ch[i];
                }
            }
            else {
                curr = 1;
            }
            i++;
        }
        System.out.println(maxChar +" " + (max));
    }
}
