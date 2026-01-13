package stack_monu_bhaiya;

import java.util.*;

public class next_greater_element {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                ans[st.pop()]=arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()]=-1;
        }
        for(int i=0;i<ans.length;i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
// monotonic stack==> the stack in which values corresponding to index in stack is in strictly
// increasing or decreasing order.