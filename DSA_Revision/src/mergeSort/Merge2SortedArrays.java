package mergeSort;

public class Merge2SortedArrays {
    public static void merge(int [] arr, int[] brr, int [] ans) {
        int i = 0, j = 0, k = 0;
        while(i < arr.length && j < brr.length) {
            if(arr[i] <= brr[j]) ans[k++] = arr[i++];
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
        int[] arr = {10, 40, 50, 60, 100, 112, 113, 114, 115};
        int[] brr = {20, 30, 34, 56, 64, 75, 85};

        int[] ans = new int[arr.length+brr.length];

        merge(arr, brr, ans); // TC = O(m+n)
        print(ans);
    }
}
