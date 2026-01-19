package bit_manipulation;
import java.util.*;

public class subsequence_without_recursion {
    public static void main(String[] args) {
        String s = "abc";
        subsequence(s);
    }

    public static void subsequence(String s) {
        int n = s.length();
        int total = 1 << n;   // 2^n
        String[] arr = new String[total];
        int k = 0;

        for (int i = 0; i < total; i++) {
            int temp = i;
            int idx = 0;
            StringBuilder ans = new StringBuilder();

            while (temp > 0) {
                if ((temp & 1) == 1) {
                    ans.append(s.charAt(idx));
                }
                temp >>= 1;
                idx++;
            }

            arr[k] = ans.toString();
            k++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
