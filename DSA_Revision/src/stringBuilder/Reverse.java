package stringBuilder;

public class Reverse {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("I am nikunj mehta");

        int i = 0, j = sb.length() - 1;
        System.out.println(sb);

        while(i <= j) {
            char a = sb.charAt(i);
            char b = sb.charAt(j);

            sb.setCharAt(i, b);
            sb.setCharAt(j, a);
            i++;
            j--;
        }
        System.out.println(sb);
        System.out.println(sb.reverse());
    }
}
