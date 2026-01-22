package phase4.Day3;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        int[] ans=helper(temperatures);
        System.out.println(Arrays.toString(ans)); //[1, 1, 4, 2, 1, 1, 0, 0]
    }
    public static int[] helper(int[] arr){
        int n= arr.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=0;
            }
            else{
                ans[i]=st.peek()-i;
            }
            st.push(i);
        }
        return ans;
    }
}
