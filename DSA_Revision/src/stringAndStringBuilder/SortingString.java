package stringAndStringBuilder;

import java.util.Arrays;

public class SortingString {
    public static void main(String[] args) {
        String s = "raghavAZing";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for(char ele: ch) {
            System.out.print(ele + " ");
        }
        System.out.println();

        StringBuilder sb = new StringBuilder("NikUnjAxipsU");
        String str = sb.toString(); // can't convert sb to char[] directly so first to string then to char[].
        char[] ch2 = str.toCharArray();
        Arrays.sort(ch2);
        for(char ele: ch2) {
            System.out.print(ele + " ");
        }
        System.out.println();

    }
}
