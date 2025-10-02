package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class SubsetOfString {
    public static void subset(String str, String ans, int i, ArrayList al) {
        if(i == str.length()) {
            al.add(ans);
            return; // this return anything doesn't matters
        }
//        subset(str, ans, i+1, al); // don't take current char
//        subset(str, ans+str.charAt(i), i+1, al); // take current char
        subset(str, ans, i+1, al);
        ans += str.charAt(i);
        subset(str, ans, i+1, al);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        ArrayList<String> al = new ArrayList<>();
        subset(str, "", 0, al);
        System.out.println(al);
    }
}
