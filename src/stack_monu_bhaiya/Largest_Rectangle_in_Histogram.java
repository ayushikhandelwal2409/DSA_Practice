package stack_monu_bhaiya;
import java.util.*;
public class Largest_Rectangle_in_Histogram {
    public static void main(String[] args) {
        int arr[]= {2,1,5,6,2,3};
        histogram(arr);
    }
    public static void histogram(int arr[]) {
        Stack<Integer> st=new Stack<>();
        int ans=0;
        for(int i=0;i<arr.length;i++) {
            while(!st.isEmpty() && arr[i]<arr[st.peek()]) {
                int h=arr[st.pop()];
                int r=i;
                if(st.isEmpty()) {
                    ans=Math.max(ans, h*r);
                }
                else {
                    int l=st.peek();
                    int area=h*(r-l-1);
                    ans=Math.max(ans, area);
                }
            }
            st.push(i);
        }

        int r=arr.length;
        while(!st.isEmpty()) {
            int h=arr[st.pop()];
            if(st.isEmpty()) {
                ans=Math.max(ans, h*r);
            }
            else {
                int l=st.peek();
                int area=h*(r-l-1);
                ans=Math.max(ans, area);
            }
        }
        System.out.println(ans);
    }
}
