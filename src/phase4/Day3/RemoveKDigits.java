package phase4.Day3;

import java.util.Stack;

public class RemoveKDigits {
    public static void main(String[] args) {
        String num = "1432219";
        int k = 3;
        System.out.println(helper(num,k));//1219
    }
    public static String helper(String num,int k){
        Stack<Character> st=new Stack<>();
        for(char ch:num.toCharArray()){
            while(!st.isEmpty() && k>0 && st.peek()>ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k>0 && !st.isEmpty()){
            st.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        String ans=sb.reverse().toString().replaceFirst("^0+(?!$)","");
        return ans;
    }
}
