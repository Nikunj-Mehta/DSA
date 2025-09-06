package exceptionHandling;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index of array: ");
        int idx = sc.nextInt();

        System.out.println("Enter the number to divide with: ");
        int num = sc.nextInt();

        try{
            System.out.println("The number you selected is: "+arr[idx]);
            System.out.println("Result: "+ arr[idx] / num);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("The index you selected is out of array's length");
            System.out.println("Select a smaller index");
        }
        catch(ArithmeticException e) {
            System.out.println("The Number you selected to divide is not giving appropriate answer.");
            System.out.println("Please select a number larger than 0");
        }
        catch(Exception e) {
            System.out.println("Some error");
            System.out.println(e);
        }
    }
}
