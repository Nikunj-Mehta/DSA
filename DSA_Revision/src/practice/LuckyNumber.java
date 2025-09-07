package practice;

import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of letters: ");
        int letters = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the name: ");
        String name = sc.nextLine();

//        int i = 0;
//        int j = i + 1;
//        int luckyNo = 0;
//        while(i < name.length()) {
//            int ascii = (int) name.charAt(i);
//            if(j % 2 != 0 || ascii % 2 != 0) {
//                luckyNo += (ascii * j);
//            }
//            i++;
//            j = i + 1;
//        }
        int luckyNo = 0;
        for(int i = 1; i <= name.length(); i++) {
            int ascii = (int) name.charAt(i - 1);
            if(i % 2 != 0 || ascii % 2 != 0) {
                luckyNo += (i * ascii);
            }
        }
        System.out.println("Lucky No: " + luckyNo);
    }
}
