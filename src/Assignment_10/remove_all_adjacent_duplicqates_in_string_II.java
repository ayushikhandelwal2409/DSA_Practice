package Assignment_10;
import java.util.*;

class Pair {
    char c;
    int count;
    Pair(char c, int count) {
        this.c = c;
        this.count = count;
    }
}
public class remove_all_adjacent_duplicqates_in_string_II {
    public static void main(String[] args) {
        String s = "deeedbbcccbdaa";
        int k = 3;
        System.out.println(removeDuplicates(s,k));
    }

    public static String removeDuplicates(String s, int k) {
        Stack<Pair> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (!st.isEmpty() && st.peek().c == ch) {
                st.peek().count++;
                if (st.peek().count == k) {
                    st.pop();
                }
            } else {
                st.push(new Pair(ch, 1));
            }
        }
        for (Pair p : st) {
            sb.append(String.valueOf(p.c).repeat(p.count));
        }

        return sb.toString();
    }
}
//Input: s = "deeedbbcccbdaa", k = 3
//Output: "aa"
//tc=>0(n)
//sc=>0(n)