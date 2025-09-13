package practice;

import java.util.Arrays;
import java.util.Scanner;

public class ASCIIofUniqueChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        if (str.isEmpty()) {
            System.out.println(0); // Edge case: empty string
            return;
        }

        char[] ch = str.toCharArray();
        Arrays.sort(ch); // sort so same characters are adjacent

        int i = 0;
        int sum = 0;

        while (i < ch.length) {
            int j = i;
            while (j < ch.length && ch[j] == ch[i]) {
                j++; // count occurrences of ch[i]
            }

            int count = j - i;
            int asciiSum = ((int) ch[i]) * count;
            int mod = asciiSum % 5;

            if (mod != 0) {
                sum += mod;
            }

            i = j; // move to next unique character
        }

        System.out.println("Result: " + sum);
    }
}
