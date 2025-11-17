package advancedSorting.quickSort;

public class QuickSorting {
    public static void print(int[] arr) {
        for(int ele: arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int[] arr, int lo, int hi) {
        if (hi - lo <= 1) return;  // 0 or 1 element → already sorted
        // Find the pivot
        int pivot = arr[lo];
        int smallerCount = 0;
        // Find all the elements smaller than pivot.
        for(int i = lo; i < hi; i++) {
            if(arr[i] < pivot) smallerCount++;
        }
        int pivotIdx = lo + smallerCount; // Why because in every call position of pivot will change, so we will get the smaller elements from the lo.
        // keep the pivot on it's correct position
        swap(arr, lo, pivotIdx); // Now the pivot element is on it's correct position.

        // use two pointer and put all the elements smaller than pivot to left and elements greater than pivot to right of pivotIdx.
        int i = lo;
        int j = hi-1;
        while(i < pivotIdx && j > pivotIdx) {
            if(arr[i] < pivot) i++;
            if(arr[j] > pivot) j--;
            if(arr[i] > pivot && arr[j] < pivot) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        // use quick sort on the two parts and give recursive calls
        quickSort(arr, lo, pivotIdx);
        quickSort(arr, pivotIdx+1, hi);
    }
    public static void main(String[] args) {
        int[] arr = {4, 9, 7, 1, 2, 3, 6, 5, 8};

        print(arr);
        quickSort(arr, 0, arr.length);
        print(arr);
    }
}