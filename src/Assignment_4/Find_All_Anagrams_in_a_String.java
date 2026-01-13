package Assignment_4;
import java.util.*;

public class Find_All_Anagrams_in_a_String {
    public static void main(String[] args) {
        String s="cbaebabacd";
        String p="abc";
        System.out.println(findAnagrams(s,p));
    }
    public static List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        int m=p.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<m;i++){
            char ch=p.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        int start=0;
        HashMap<Character,Integer> s_freq=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            s_freq.put(ch,s_freq.getOrDefault(ch,0)+1);
            if( i-start+1>m ){
                s_freq.put(s.charAt(start),s_freq.get(s.charAt(start))-1);
                if(s_freq.get(s.charAt(start))==0){
                    s_freq.remove(s.charAt(start));
                }
                start++;
            }

            if(s_freq.equals(map)){
                ans.add(start);
            }
        }
        return ans;
    }
}
//Input: s = "cbaebabacd", p = "abc"
//Output: [0,6]

//tc==>O(n)
//sc==>2 hashmap and 1 ans list ==>O(k+n)