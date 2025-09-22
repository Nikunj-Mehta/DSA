package Recursion;

public class ArrayTraversal {
    public static void printArray(int[] arr, int idx) {
        if(idx == arr.length) return;
        System.out.print(arr[idx] + " ");
        printArray(arr, idx+1);
    }
    public static void printReverseArray(int[] arr, int i){
        if(i == arr.length) return;
        printReverseArray(arr, i+1);
        System.out.print(arr[i] + " ");
    }
    public static void main(String[] args) {
        int[] arr = {21, 13, 42, 24, 32, 25, 74};
        // Iterative method
        for(int ele: arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        // Recursive Approach
        printArray(arr, 0);
        printReverseArray(arr, 0);
    }
}
