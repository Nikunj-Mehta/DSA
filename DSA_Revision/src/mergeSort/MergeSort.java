package mergeSort;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        if(arr.length == 1) return;
        // Create 2 arrays of n/2 and n-n/2 size because we may have arr of size 7 so we will get 4 and 3 sized array.
        int[] helper1 = new int[arr.length/2];
        int[] helper2 = new int[arr.length - arr.length/2];

        // Copy paste the elements of arr into helper1 and helper2
        int i = 0;
        for( ; i < helper1.length; i++) helper1[i] = arr[i];
        int a = i;
        for( ; i < arr.length; i++) helper2[i-a] = arr[i];

        // divide the remaning array into smaller parts untill base case is reached
        mergeSort(helper1);
        mergeSort(helper2);

        // now use the code of Merge two sorted arrays and merge helper1 and helper2 into arr.
        merge(helper1, helper2, arr);
        helper1 = null; // This is done to reduce the SC form O(nlogn) to O(n)
        helper2 = null; // Delete the array after they are merged.
    }

    public static void merge(int [] arr, int[] brr, int [] ans) {
        int i = 0, j = 0, k = 0;
        while(i < arr.length && j < brr.length) {
            if(arr[i] <= brr[j]) ans[k++] = arr[i++]; // Make sure to use arr[i] <= brr[j] to make merge sort a stable sorting algorithm.
            else ans[k++] = brr[j++];
        }
        while(j < brr.length) ans[k++] = brr[j++]; // This will only execute when j < brr.length so there is no need of if(j == brr.length)
        while(i < arr.length) ans[k++] = arr[i++]; // or if(i == arr.length) for this line
    }

    public static void print(int[] arr) {
        for(int ele: arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {80, 20, 73, 65, 60, 40, 50};
        print(arr);
        mergeSort(arr); // TC = O(nlogn) SC = O(nlogn) we can make SC = O(n) by setting extra arrays to null after they are merged
        print(arr);
    }
}
