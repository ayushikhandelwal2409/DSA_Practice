package HASHMAP;

import java.util.*;
import java.util.HashMap;

public class Group_Anagrams {
    public static void main(String[] args) {
        String[]  str={"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans=group_anagrams(str);
        System.out.println(ans);

    }
    public static List<List<String>> group_anagrams(String[] arr){
        HashMap<String ,List<String>> map=new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            String key=GetKey(arr[i]);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(arr[i]);
        }
        List<List<String>> ll=new ArrayList<>();
        for(String  key: map.keySet()){
            ll.add(map.get(key));
        }
        System.out.println(map);
        return ll;
    }
    public static String GetKey(String str){
        int[] arr=new int[26];
        for (int i = 0; i < str.length(); i++) {
            int idx=str.charAt(i)-'a';
            arr[idx]++;
        }
        StringBuilder s=new StringBuilder();
        for (int i = 0; i < 26; i++) {
            s.append(arr[i]+" ");   // space is important to separate count of each element
        }
        return s.toString();
    }
}
