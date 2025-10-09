package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintParanthesis {
//    public static void printValidParanthesis(int n, int opeaningBrackets, int closingBrackets, String str) {
//        if(opeaningBrackets == n && closingBrackets == n) { // Base Case.
//            System.out.println(str);
//            return;
//        }
//        if(str.isEmpty()) {
//            printValidParanthesis(n, opeaningBrackets+1, closingBrackets, str+"(");
//            return;
//        }
//
//        if(opeaningBrackets > closingBrackets) {
//            if(opeaningBrackets < n) printValidParanthesis(n, opeaningBrackets+1, closingBrackets, str+"(");
//            if(closingBrackets < n) printValidParanthesis(n, opeaningBrackets, closingBrackets+1, str+")");
//        }
//        else if(opeaningBrackets == closingBrackets) {
//            if(opeaningBrackets < n) printValidParanthesis(n, opeaningBrackets+1, closingBrackets, str+"(");
//        }
//    }

    public static ArrayList<String> printValidParanthesis(int n, int opeaningBrackets, int closingBrackets, String str, ArrayList<String> ans) {
        if(str.length() == 2*n) { // Base Case.
            System.out.println(str);
            ans.add(str);
            return ans;
        }

        if(opeaningBrackets < n) printValidParanthesis(n, opeaningBrackets+1, closingBrackets, str+"(", ans);
        if(closingBrackets < opeaningBrackets) printValidParanthesis(n, opeaningBrackets, closingBrackets+1, str+")", ans);
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        ArrayList<String> ans = new ArrayList<>();
        printValidParanthesis(n, 0, 0, "", ans);
    }
}
