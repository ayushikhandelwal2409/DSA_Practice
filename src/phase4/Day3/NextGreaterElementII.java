package phase4.Day3;

import java.util.*;

public class NextGreaterElementII {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] ans=helper(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] helper(int[] a){
        int n=a.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            while(!st.isEmpty()  && a[st.peek()]<=a[i%n]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i%n]=-1;
            }
            else{
                ans[i%n]=a[st.peek()];
            }
            st.push(i%n);
        }
        return ans;
    }
}
