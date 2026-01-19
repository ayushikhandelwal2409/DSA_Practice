package phase4.Day2;

import java.util.*;

public class Delete_Middle_Element_of_Stack {
    static int mid=-1;
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};//[50, 40, 20, 10]
        Stack<Integer> s=new Stack<>();
        for(int i: arr){
            s.push(i);
        }
        helper(s,1);
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
    public static void helper(Stack<Integer> st,int idx){
        if(st.isEmpty()){
            mid=idx-(idx/2);
            return;
        }
        int ele=st.pop();
        helper(st,idx+1);
        if(idx!=mid){
            st.push(ele);
        }
    }
}
