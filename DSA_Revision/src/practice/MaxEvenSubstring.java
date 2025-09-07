package practice;

import java.util.Scanner;

public class MaxEvenSubstring {
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the line: ");
        String str = sc.nextLine();
        String[] arr = str.split(" "); // WhereEver space is encountered it is converted to an array.

        int maxLen = 0;
        int maxLenIdx = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].length() % 2 != 0) continue;
            if(!isVowel(arr[i].charAt(0))) continue;
            if(arr[i].length() > maxLen) {
                maxLen = arr[i].length();
                maxLenIdx = i;
            }
        }
        if(maxLen == 0) System.out.println("00");
        else System.out.println(arr[maxLenIdx]);
    }
}
