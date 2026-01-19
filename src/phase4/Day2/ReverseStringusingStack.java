package phase4.Day2;

import java.util.Stack;

public class ReverseStringusingStack {
    public static void main(String[] args) {
        String s="qwerty";
        System.out.println(reverse(s));
    }
    public static String reverse(String s){
        String ans="";
        Stack<Character> st=new Stack<>();
        for (char ch:s.toCharArray()){
            st.push(ch);
        }
        while (!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
    }
}
