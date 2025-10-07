package practice;

import java.util.Scanner;

public class PasswordCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String one = sc.next();
        System.out.print("Enter string 2: ");
        String two = sc.next();

        StringBuilder ans = new StringBuilder();

        int i = 0;
        int j = 0;
        while(i < one.length() && j < two.length()) {
            ans.append(one.charAt(i++));
            ans.append(two.charAt(j++));
        }
        if(i == one.length()) ans.append(two.substring(j));
        else if(j == two.length()) ans.append(one.substring(i));

        System.out.println(ans);
    }
}
