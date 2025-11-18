package advancedSorting.quickSort;

import java.util.Scanner;

public class KthSmallestEle {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int[] arr, int lo, int hi, int k) { // This is also known as Quick Select algorithm
        if(lo > hi) return;
//        if(lo == hi) { // Not really required
//            if(lo+1 == k) {
//                System.out.println((k)+"th smallest element is: " + arr[lo]);
//                return;
//            }
//        }
        int mid = (lo + hi) / 2;
        int pivot = arr[mid]; // Take a pivot element
        int smallCount = 0;
        for(int i = lo; i < hi; i++) {
            if(i == mid) continue;
            if(arr[i] <= pivot) smallCount++;
        }
        int pivotIdx = lo + smallCount; // Find the pivot's correct position
        swap(arr, mid, pivotIdx); // Place the pivot on it's correct position

        // Keep all the elements smaller than pivot on it's left and all elements larger that pivot on it's right
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
            System.out.print(k+"th smallest element is: " + arr[pivotIdx]); // 5th smallest element in sorted array will be arr[4] as array is 0 indexed.
            return;
        }
        else if(k < pivotIdx+1) quickSort(arr, lo, pivotIdx, k); // The element we need lies in left half
        else quickSort(arr, pivotIdx+1, hi, k); // That is the element we want lies in the right half
    }
    public static void main(String[] args) {
        int[] arr = {4, 9, 7, 1, 3, 6};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter K: ");
        int k = sc.nextInt();
        quickSort(arr, 0, arr.length, k);
    }
}
