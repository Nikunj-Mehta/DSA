package practice;

import java.util.*;

public class ConvertToPermutation {
    // Returns min replacements; modifies A in-place to a valid permutation.
    static int minReplacementsToPermutation(int[] A) {
        int N = A.length;
        boolean[] seen = new boolean[N + 1];
        List<Integer> dupIdx = new ArrayList<>();

        // Keep first valid occurrence; mark duplicates/out-of-range
        for (int i = 0; i < N; i++) {
            int x = A[i];
            if (1 <= x && x <= N && !seen[x]) {
                seen[x] = true;
            } else {
                dupIdx.add(i);
            }
        }

        // Fill missing values into the duplicate/out-of-range positions
        int k = 0;
        for (int v = 1; v <= N; v++) {
            if (!seen[v]) {
                A[dupIdx.get(k++)] = v;
            }
        }
        return dupIdx.size(); // = number of replacements
    }

    public static void main(String[] args) {
        int[] A = {1, 1, 3, 3, 4}; // N = 5
        int ops = minReplacementsToPermutation(A);
        System.out.println("min replacements = " + ops);        // 2
        System.out.println("permutation      = " + Arrays.toString(A)); // e.g. [1, 2, 3, 5, 4]

        // If you specifically want [1,2,3,4,5] in order, just sort after fixing:
        Arrays.sort(A);
        System.out.println("sorted permutation = " + Arrays.toString(A)); // [1, 2, 3, 4, 5]
    }
}
