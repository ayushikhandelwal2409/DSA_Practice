package recursion;
import java.util.*;
public class permutation {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        String s="Ayushi";
        per(s,"",l);
        System.out.println(l);
    }
    public static void per(String s,String ans,ArrayList<String> list){
        if(s.length()==0){
            list.add(ans);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i) ;
            String S1=s.substring(0,i);
            String S2=s.substring(i+1);
            per(S1+S2,ans+ch,list);
        }
    }
}
