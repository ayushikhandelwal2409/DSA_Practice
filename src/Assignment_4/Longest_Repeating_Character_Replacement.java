package Assignment_4;
import java.util.*;

public class Longest_Repeating_Character_Replacement {
    public static void main(String[] args) {
        String s="ABAB";
        int k=2;
        System.out.println(characterReplacement(s,k));
    }
    public static int characterReplacement(String s, int k) {
        int maxc=0;
        int left=0;
        int maxlen=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxc=Math.max(maxc,map.get(ch));
            while(right-left+1-maxc>k){
                char leftchar=s.charAt(left);
                map.put(leftchar, map.get(leftchar) - 1);
                if (map.get(leftchar) == 0) {
                    map.remove(leftchar);
                }
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}
//Input: s = "ABAB", k = 2
//Output: 4
//tc==>O(n)
//sc==>O(m)==>for map