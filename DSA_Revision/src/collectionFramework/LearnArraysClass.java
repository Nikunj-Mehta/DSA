package collectionFramework;

import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 2, 56, 74, 24, 46, 74, 7, 89};
        Arrays.sort(numbers);
        for(int ele: numbers) {
            System.out.print(ele + " ");
        }
        int index = Arrays.binarySearch(numbers, 56); // Works only on sorted array.
        System.out.println("The index of element 56 is: " + index);
        Arrays.fill(numbers, 20); // all elements of array numbers will be filled by 20.
        for(int ele: numbers) {
            System.out.print(ele + " ");
        }
    }
}