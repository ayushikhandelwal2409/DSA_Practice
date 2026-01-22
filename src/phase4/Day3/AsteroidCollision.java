package phase4.Day3;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[]  asteroids = {5,10,-5};
        int[] ans=helper(asteroids);
        System.out.println(Arrays.toString(ans));//[5, 10]

    }
    public static int[] helper(int[] asteroids){
        int n=asteroids.length;
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i < n; i++) {
            if(asteroids[i]>0){
                st.push(i);
            }
            else{
                while(!st.isEmpty() &&  asteroids[st.peek()]>0 && asteroids[st.peek()]<-asteroids[i]){
                    st.pop();
                }
                if(st.isEmpty() ||  asteroids[st.peek()]<0){
                    st.push(i);
                }
                if(asteroids[st.peek()]==-asteroids[i]){
                    st.pop();
                }
            }
        }
        int[] ans=new int[st.size()];
        int i=st.size()-1;
        while(!st.isEmpty()){
            ans[i]=asteroids[st.pop()];
            i--;
        }
        return ans;
    }
}
