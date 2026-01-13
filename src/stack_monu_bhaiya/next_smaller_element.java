package stack_monu_bhaiya;

import java.util.Scanner;
import java.util.Stack;

public class next_smaller_element {
    public static void main(String[] args) {
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
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=i+1;
            }
            else {
                ans[i] = i - st.peek();
            }
            st.push(i);
        }
        for(int i=0;i<ans.length;i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
