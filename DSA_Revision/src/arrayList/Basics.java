package arrayList;

import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6); // If nothing in () then it creates a 0 size ArrayList, and it increases it's size when elements are added as it is dynamic ds.
        arr.add(0, 10); // If we didn't initialize the array then we get the error, if we do index wise printing.
        arr.add(1, 20); // initialize
        arr.add(2, 30); // arr[2] = 30;
        arr.add(3, 40);
        arr.add(4, 50);
        arr.add(5, 60);

        System.out.println(arr); // Built in function: we can get all the elements of arraylist printed, though it runs the loop internally. If we did this in array then we get memory address in hexadecimal form.

        System.out.println("Initial size of arrayList: " + arr.size());
        for(int i = 0; i < arr.size(); i++) { // instead of arr.length which is in array we need to use arr.size().
            System.out.print(arr.get(i) + " "); // index wise printing.
        }
        System.out.println();

        arr.set(2, 300); // modify
        System.out.println("ArrayList after modifying a ele: " + arr);

        arr.add(70); // Push back: always gets added to last and increases the size of arraylist dynamically.
        System.out.println("ArrayList after adding an element: " + arr.size());
        System.out.println(arr);

        arr.remove(1); // takes the index of element to remove, shifts all the rest elements to left, no empty space in betn(index 1).
        System.out.println("ArrayList after removing an element: " + arr.size());
        System.out.println(arr);
    }
}
