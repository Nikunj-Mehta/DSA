package advancedSorting.cyclicSort;

public class CyclicSort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr) {
        for(int ele: arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 0, 4, 7, 1, 5, 3};
        print(arr);
        int i = 0;
        while(i < arr.length) { // This sorting technique is used only when we have n size array and all elements are also from 0 to n-1 or 1 to n
            if(arr[i] == i) i++; // if elements are from 1 to n-1 then arr[i] == i+1 so arr[0] == 1
            else {
                swap(arr, i, arr[i]); // Repeat the swapping until the correct is on it's correct index. eg repeat swapping until 1 is at index 1 or arr[1] = 1;
            }
        }
        print(arr);
    }
}
