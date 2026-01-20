package phase4.Day2;
import java.util.*;
public class HelpClassmates {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {3, 8, 5, 2, 25};
        int[]ans=help_classmate(arr,n);
        System.out.println(Arrays.toString(ans)); //[2, 5, 2, -1, -1]
    }
    public static int[] help_classmate(int arr[], int n) {
        // Your code goes here
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()  && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=arr[st.peek()];
            }
            st.push(i);
        }
        return ans;
    }
}
