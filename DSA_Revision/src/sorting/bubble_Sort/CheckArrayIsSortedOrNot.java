package sorting.bubble_Sort;

public class CheckArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1, 4, 28, 1743, 955, 10000};

        boolean flag = true; // Assuming array is sorted
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]){
                flag = false; // Means array is not sorted.
                break;
            }
        }
        if(flag == true) System.out.println("Array is sorted");
        else System.out.println("Array is not sorted");

    }
}
