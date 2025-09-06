package practice;

import java.util.Scanner;

public class BillAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of pizza: ");
        int pizza = sc.nextInt();
        System.out.print("Enter the no of puffs bought: ");
        int puff = sc.nextInt();
        System.out.print("Enter the no of coldDrinks bought: ");
        int coldDrink = sc.nextInt();

        int toalAmount = pizza*100 + puff*20 + coldDrink*10;
        System.out.println("Bill amount is: Rs " + toalAmount);
    }
}
