package sorting.selection_sort;

public class KthMaxEleOnItsRightPlace {
    public static void print(int[] arr) {
        for(int ele: arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 4, 2, 6, 2, 43, 46, 75, 52};

        print(arr);
        for(int i = 0; i < arr.length - 1; i++) {
            int max = Integer.MIN_VALUE;
            int maxidx = -1;
            for(int j = 0; j < arr.length-i; j++) {
                if(arr[j] > max) {
                    max = arr[j];
                    maxidx = j;
                }
            }
            int temp = arr[maxidx];
            arr[maxidx] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        print(arr);
    }
}
