package sorting.selection_Sort;

public class SelectionSort {
    public static void print(int[] arr) {
        for(int ele: arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {6, 74, 1, 5, 2, 7, 9};

        print(arr);
        for(int j = 0; j < arr.length - 1; j++) {
            int min = Integer.MAX_VALUE;
            int mindex = 0;
            for(int i = j; i < arr.length; i++) {
                if(arr[i] < min) {
                    min = arr[i];
                    mindex = i;
                }
            }
            // Swap ele at 0th index by min ele first then 1st ele by next min and so on
            int temp = arr[j];
            arr[j] = arr[mindex];
            arr[mindex] = temp;
        }
        print(arr);
    }
}
