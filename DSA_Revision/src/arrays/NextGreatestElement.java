package arrays;

public class NextGreatestElement {
    public static void main(String[] args) {
        int[] arr = {12, 8, 60, 37, 2, 49, 16, 28, 21};
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1] = -1;

        // Brute force
//        for(int i = 0; i < n-1; i++) {
//            int max = 0;
//            for(int j = i+1; j < n; j++) {
//                max = Math.max(max, arr[j]);
//            }
//            arr[i] = max;
//        }
//        arr[n-1] = -1;
//
//        for(int ele: arr) {
//            System.out.print(ele + " ");
//        }

        // Optimised max in reverse traversal.
        int nge = arr[n-1];
        for(int i = n-2; i >= 0; i--){
            ans[i] = nge;
            nge = Math.max(nge, arr[i]);
        }
        for(int ele: ans) {
            System.out.print(ele + " ");
        }
    }
}
