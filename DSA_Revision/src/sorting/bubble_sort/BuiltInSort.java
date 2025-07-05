package sorting.bubble_sort;

import java.util.Arrays;

public class BuiltInSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2032,42,5,1,54};
        System.out.print("Before Sorting: ");
        for(int ele: arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.print("After sorting: ");
        Arrays.sort(arr);
        for(int ele: arr) {
            System.out.print(ele + " ");
        }
    }
}
