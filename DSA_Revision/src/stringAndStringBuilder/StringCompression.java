package stringAndStringBuilder;

public class StringCompression {
        public static int compress(char[] arr) {
            int i = 0, j = 0, n = arr.length, count = 0;

            StringBuilder sb = new StringBuilder();
            while(j < n) {
                sb.append(arr[i]);
                while(j < n && arr[i] == arr[j]) {
                    count++;
                    j++;
                }
                if(count > 1) {
                    sb.append(count);
                }
                count = 0;
                i = j;
            }
            for(int k = 0; k < sb.length(); k++) {
                arr[k] = sb.charAt(k); // compressed the original array
                System.out.print(sb.charAt(k) + " ");
            }
            System.out.println();
            return sb.length(); // return the compressed length
        }

    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'b', 'b', 'c', 'd', 'e', 'e', 'e', 'e', 'e'} ;
        int ans = compress(arr);
        System.out.println("Length of string after compression: " + ans);
    }
}
