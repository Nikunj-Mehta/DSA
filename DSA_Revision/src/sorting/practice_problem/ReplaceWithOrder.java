package sorting.practice_problem;

public class ReplaceWithOrder {
    public static void print(int[] arr) {
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {54, 11, 28, 93, 47, 63};

        // in order to replace array with order lets start with largest element. Because if we start with smallest element then we will be troubled by -ve values
        int n = arr.length-1;
        int a = 0;
        print(arr);
        for(int i = 0; i < arr.length; i++) {
            int min = Integer.MAX_VALUE;
            int minIdx = -1;
            for(int j = 0; j < arr.length; j++) {
                if(arr[j] > a && arr[j] < min) {
                    min = arr[j];
                    minIdx = j;
                }
            }
            arr[minIdx] = a++;
        }
        print(arr);
    }
}
