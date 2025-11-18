package advancedSorting.quickSort;

import java.util.Scanner;

public class KthLargestEle {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int[] arr, int lo, int hi, int k) { // This is also known as Quick Select Algorithm
        if(lo > hi) return;
//        if(lo == hi) { // Not really required
//            if(lo+1 == k) {
//                System.out.println((arr.length-k+1)+"th largest element is: " + arr[lo]);
//                return;
//            }
//        }

        int mid = (lo + hi) / 2;
        int pivot = arr[mid]; // Pick middle element as pivot
        int smallCount = 0; // Find no of elements smaller than that
        for(int i = lo; i < hi; i++) {
            if(i == mid) continue;
            if(arr[i] <= pivot) smallCount++;
        }
        int pivotIdx = lo + smallCount; // Find the pivot's correct position
        swap(arr, mid, pivotIdx); // Keep the pivot on it's correct position

        // Now keep all the elements smaller than pivot on it's left and elements greater than pivot on it's right
        int i = lo;
        int j = hi-1;
        while(i < pivotIdx && j > pivotIdx) {
            if(arr[i] <= pivot) i++;
            else if(arr[j] > pivot) j--;
            else if(arr[i] > pivot && arr[j] <= pivot) {
                swap(arr, i, j);
            }
        }

        if(pivotIdx+1 == k) {
            System.out.print((arr.length-k+1) + "th largest element is: "+ arr[pivotIdx]); // Kth largest element will be = (n-k+1)th smallest element and now that element will be (k-1)th ele. The kth ele will be on the (i-1)th position as array is 0-based Indexed.
            return;
        }
        else if(k < pivotIdx+1) quickSort(arr, lo, pivotIdx, k); // The element we need lies in left half
        else quickSort(arr, pivotIdx+1, hi, k); // That is the element we want lies in the right half
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 7, 8};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter K: ");
        int k = sc.nextInt();
        // Now, kth largest element = (n - k + 1)th smallest element.
        k = arr.length - k + 1;
        quickSort(arr, 0, arr.length, k);
    }
}
