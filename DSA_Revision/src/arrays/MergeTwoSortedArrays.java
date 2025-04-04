package arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr = {11, 33, 42, 71};
        int n = arr.length;
        int[] brr = {26, 54, 69, 81};
        int m = brr.length;

        int[] result = new int[m+n];

        int i = 0, j = 0, k = 0;
        while(i < n && j < m) {
            if(arr[i] <= brr[j]) {
                result[k] = arr[i];
                i++;
            }
            else {
                result[k] = brr[j];
                j++;
            }
            k++;
        }
        if(i == n){ // now take elements form brr only.
            while(j < m) {
                result[k] = brr[j];
                j++;
                k++;
            }
        }
        if(j == m) { // now take elements form arr only.
            while(i < n) {
                result[k] = arr[i];
                i++;
                k++;
            }
        }
        for(int ele: result){
            System.out.print(ele + " ");
        }
    }
}
