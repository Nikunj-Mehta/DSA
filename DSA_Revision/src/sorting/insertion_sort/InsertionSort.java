package sorting.insertion_sort;

public class InsertionSort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 1, 9, 1, 46, 24, 74, 26, 43, 73, 75, 23, 68};
        print(arr);

//        for(int i = 1; i < arr.length; i++) {
//            for(int j = i; j >= 1 && arr[j] < arr[j - 1]; j--) {
//                swap(arr, j, j-1);
//            }
//        }
//        print(arr);

        // Insertion sort using while loop
        for(int i = 1; i < arr.length; i++) {
            int j = i;
            while(j >= 1 && arr[j] < arr[j - 1]) {
                swap(arr, j, j-1);
                j--;
            }
        }
        print(arr);
    }
}
