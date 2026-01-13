package Assignment_4;

import java.util.*;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(substr(s));
    }
    public static int substr(String s){
        HashSet<Character> set = new HashSet<>();
        int start=0;
        int max=0;
        for (int i = 0; i < s.length(); i++) {
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(i));
            max=Math.max(max,i-start+1);
        }
        return max;
    }
}
//Input: s = "abcabcbb"
//Output: 3

//TC: O(n)
//SC: O(n)