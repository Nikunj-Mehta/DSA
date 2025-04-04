package arrays;

public class Sort0sAnd1s {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1};
        int n = arr.length;

        int i = 0;
        int j = n - 1;

        while(i < j) {
            if(arr[i] == 0) i++;
            if(arr[j] == 1) j--; // or use else if
//            if(i > j) break;
            if(i < j && arr[i] == 1 && arr[j] == 0) { // or use else if and remove i < j form condition.
                arr[i] = 0;
                arr[j] = 1;
                i++; j--;
            }

        }
        for(int ele: arr) {
            System.out.print(ele + " ");
        }
    }
}
