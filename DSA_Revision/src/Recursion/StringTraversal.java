package Recursion;

public class StringTraversal {
    public static void printString(String str, int i) {
        if(i == str.length()) return;
        System.out.print(str.charAt(i) + " ");
        printString(str, i + 1);
    }

    public static String printStringWithouta(String str, String ans, int i) {
        if(i == str.length()) return ans;
        if(str.charAt(i) != 'a') ans += str.charAt(i);
        return printStringWithouta(str, ans, i + 1);
    }
    public static void main(String[] args) {
        String str = "Haelalo Mar.";
        System.out.println(str);
        // Iterative approach
        for(int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();

        // Recursive approach
        printString(str, 0);
        System.out.println();
        String ans = printStringWithouta(str, "", 0);
        System.out.println(ans);
    }
}
