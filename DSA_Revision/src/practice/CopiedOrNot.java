package practice;

import java.util.Arrays;
import java.util.Scanner;

public class CopiedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string of adjacent person: ");
        String adj = sc.nextLine();
        System.out.print("Enter the string of Rahul: ");
        String rahul = sc.nextLine();

        char[] ch1 = adj.toLowerCase().toCharArray();
        Arrays.sort(ch1);
        char[] ch2 = rahul.toLowerCase().toCharArray();
        Arrays.sort(ch2);

        adj = new String(ch1);
        rahul = new String(ch2);

        if(adj.equals(rahul)) System.out.println("1");
        else System.out.println("0");
    }
}
