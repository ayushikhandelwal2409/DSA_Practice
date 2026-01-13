package recursion;

import java.util.ArrayList;

public class duplicate_permutation {
    public static void main(String[] args) {
        String s="abba";
        permutationOfString(s,"");
    }
    public static void permutationOfString(String s,String ans) {
        if(s.length()==0){
            System.out.print(ans+"\t");
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(isDuplicate(s,i+1,ch)){
                String st=s.substring(0,i)+s.substring(i+1,s.length());
                permutationOfString(st, ans+ch);
            }
        }
    }

    public static boolean isDuplicate(String s,int i,char ch) {
        for (int j = i; j < s.length(); j++) {
            if(s.charAt(j)==ch){
                return false;
            }
        }
        return true;
    }
}
