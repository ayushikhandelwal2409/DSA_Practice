package Assignment_4;
import java.util.*;

public class Permutation_in_String {
    public static void main(String[] args) {
        String s1="ab";
        String s2="eidbaooo";
        System.out.println(checkInclusion(s1,s2));
    }
    public static boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();

        if (len1 > len2) {
            return false;
        }

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        for (char c : s1.toCharArray()) {
            s1Count[c - 'a']++;
        }
        int start=0;
        for (int i = 0; i < len2; i++) {
            s2Count[s2.charAt(i) - 'a']++;
            if(i-start+1>len1){
                s2Count[s2.charAt(start) - 'a']--;
                start++;
            }

            if (Arrays.equals(s1Count, s2Count)) {
                return true;
            }
        }

        return false;
    }
}

//Input: s1 = "ab", s2 = "eidbaooo"
//Output: true

//tc=>O(len1 +len2) ==>O(len2)

//sc=O(1)