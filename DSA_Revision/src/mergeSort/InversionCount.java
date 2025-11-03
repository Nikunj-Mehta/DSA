package mergeSort;

import java.util.Scanner;

public class InversionCount {
    static int inversionCount = 0;
    public static int inversionIterative(int[] arr) {
        int n = arr.length;
        int inversion = 0;
        for(int i = 0; i < n-1; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr[i] > arr[j]) inversion++;
            }
        }
        return inversion;
    }
    public static void inversionUsingMergeSort(int[] arr) {
        if(arr.length == 1) return;

        int[] helper1 = new int[arr.length/2];
        int[] helper2 = new int[arr.length - arr.length/2];
        int i = 0;
        for( ; i < helper1.length; i++) helper1[i] = arr[i];
        int a = i;
        for( ; i < arr.length; i++) helper2[i-a] = arr[i];

        inversionUsingMergeSort(helper1);
        inversionUsingMergeSort(helper2);

         // Inversion (Extra part in Merge Sort)
//        i = 0;
//        int j = 0;
//
//        while(i < helper1.length && j < helper2.length) {
//            if(helper1[i] > helper2[j]) {
//                inversionCount += helper1.length-i;
//                j++;
//            }
//            else i++;
//        }
         merge(helper1, helper2, arr);
    }

    public static void merge(int [] arr, int[] brr, int [] ans) {
        int i = 0, j = 0, k = 0;
        while(i < arr.length && j < brr.length) {
            if(arr[i] <= brr[j]) {
                ans[k++] = arr[i++]; // Make sure to use arr[i] <= brr[j] to make merge sort a stable sorting algorithm.
            }
            else { // helper1[i] > helper2[j]
                inversionCount += arr.length - i; // Instead of using inversion count code use this line and everything is done.
                ans[k++] = brr[j++];
            }
        }
        while(j < brr.length) ans[k++] = brr[j++]; // This will only execute when j < brr.length so there is no need of if(j == brr.length)
        while(i < arr.length) ans[k++] = arr[i++]; // or if(i == arr.length) for this line
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter the elements: ");
            arr[i] = sc.nextInt();
        }

        int count = inversionIterative(arr);
        System.out.println(count);

        inversionUsingMergeSort(arr);
        System.out.println(inversionCount);
    }
}
