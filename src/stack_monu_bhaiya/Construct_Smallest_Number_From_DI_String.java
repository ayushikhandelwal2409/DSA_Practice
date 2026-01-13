package stack_monu_bhaiya;

import java.util.*;

public class Construct_Smallest_Number_From_DI_String {
    public static void main(String[] args) {
        String str="IIIDIDDD";
        System.out.println(Construct(str));

    }
    public static String Construct(String s){
        int[] ans=new int[s.length()+1];
        int c=1;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length()+1;i++){
            if(i==s.length()|| s.charAt(i)=='I'){
                ans[i]=c;
                c++;
                while (!st.isEmpty()){
                    ans[st.pop()]=c;
                    c++;
                }
            }
            else{
                st.push(i);
            }
        }
        String s1="";
        for(int i:ans){
            s1+=i;
        }
        return s1;
    }
}
