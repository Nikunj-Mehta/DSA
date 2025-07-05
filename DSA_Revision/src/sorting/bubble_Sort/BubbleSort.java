package sorting.bubble_Sort;

public class BubbleSort {
    public static void print(int[] arr) {
        for(int ele: arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {4, 79, 6, 2, 8, 23, 9, 3, 78, 67, 35};

        print(arr);

        for(int j = 0; j < arr.length - 1; j++){
            boolean flag = true;
            for(int i = 0; i < arr.length - 1 - j; i++) { // after 1st pass the greatest element goes at last
                if(arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = false;
                }
            }
            if(flag) break;
        }
        print(arr);
    }
}
