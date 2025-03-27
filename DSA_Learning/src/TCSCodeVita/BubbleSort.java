package TCSCodeVita;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        // Step 1: Take input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements in array: ");
        int N = sc.nextInt();
        System.out.print("Enter the elements in array: ");
        int[] arr = new int[N];
        for(int i = 0; i < N; i++)
        {
            arr[i] = sc.nextInt();
        }
        // Deep Copy
        int[] brr = new int[N];
        for(int i = 0; i < N; i++)
        {
            brr[i] = arr[i];
        }
        // Step 2: Solution
        // Count to sort in ascending order.
        int asecCount = 0;
        for(int x = 0; x < N - 1; x++)
        {
            boolean flag = true;
            for(int i = 0; i < N - 1 - x; i++)
            {
                if(arr[i] > arr[i+1])
                {
                    // Swap with counter increment
                    asecCount++;
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = false;
                }
            }
            if(flag == true) break;
        }

        // Count to sort in descending order
        int descCount = 0;
       for(int x = 0; x < N - 1; x++)
       {
           boolean flag = true;
           for(int i = 0; i < N - 1 - x; i++)
           {
               if(brr[i] < brr[i+1])
               {
                   // Increase counter by 1 and swap
                   descCount++;
                   int temp = brr[i];
                   brr[i] = brr[i+1];
                   brr[i+1] = temp;
                   flag = false;
               }
           }
           if(flag == true) break;
       }

        System.out.println("The min swaps required is: "+ Math.min(asecCount, descCount));
    }
}