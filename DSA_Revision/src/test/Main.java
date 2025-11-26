package test;

import java.util.ArrayList;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 3, 4, 6, 7};
        Arrays.sort(arr);
        int i = 0;
        int j = i;

        ArrayList<Integer> ans = new ArrayList<>();
        while(j < arr.length) {
            ans.add(arr[i]);
            while(j < arr.length && arr[j] == arr[i]) j++;
            i = j;
        }
        for(int k = 0; k < ans.size(); k++) {
            System.out.print(ans.get(k) + " ");
        }
    }
}