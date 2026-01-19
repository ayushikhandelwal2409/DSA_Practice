package phase4.Day2;
import java.util.*;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        String s = "ab#c", t = "ad#c";
        System.out.println(backspaceCompare(s,t));
    }
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='#'){
                if(!st.isEmpty())
                    st.pop();
            }
            else
                st.push(ch);
        }
        Stack<Character> st2=new Stack<>();
        for(char ch:t.toCharArray()){
            if(ch=='#'){
                if(!st2.isEmpty())
                    st2.pop();
            }
            else
                st2.push(ch);
        }
        return st.equals(st2);
    }
}
