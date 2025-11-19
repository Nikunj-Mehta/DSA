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
        if (lo >= hi) return;  // 0 or 1 element → already sorted
        // Find the pivot
//        int pivot = arr[lo];
        int mid = (lo + hi) / 2;
        int pivot = arr[mid]; // Now instead of taking arr[lo] as pivot we prefer taking arr[mid] because it works way better in worst case when array is already sorted and in common cases both of them works almost same.
        int smallerCount = 0;
        // Find all the elements smaller than pivot.
        for(int i = lo; i < hi; i++) {
            if(i == mid) continue;
            if(arr[i] <= pivot) smallerCount++; // Quick Sort is an UnStable sorting.
        }
        int pivotIdx = lo + smallerCount; // Why because in every call position of pivot will change, so we will get the smaller elements from the lo.
        // keep the pivot on it's correct position, pivotIdx is the pivot's correct position.
        swap(arr, mid, pivotIdx); // Now the pivot element is on it's correct position.

        // use two pointer and put all the elements smaller than or equal to pivot to left and elements greater than pivot to right of pivotIdx.
        int i = lo;
        int j = hi-1;
        while(i < pivotIdx && j > pivotIdx) {
            if(arr[i] <= pivot) i++;
            else if(arr[j] > pivot) j--;
            else if(arr[i] > pivot && arr[j] <= pivot) {
                swap(arr, i, j);
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