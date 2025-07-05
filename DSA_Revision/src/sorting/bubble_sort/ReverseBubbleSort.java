package sorting.bubble_sort;

public class ReverseBubbleSort {
    public static void print(int[] arr){
        for(int ele: arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5, 6, 2, 8, 35, 83, 446, 24, 9};

        print(arr);

        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        print(arr);
    }
}
