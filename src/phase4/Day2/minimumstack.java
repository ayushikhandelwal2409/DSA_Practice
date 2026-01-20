package phase4.Day2;
import java.util.*;

public class minimumstack {
      static class MinStack {
        Stack<Integer> minstack;
        Stack<Integer> st;
        public MinStack() {
            minstack=new Stack<>();
            st=new Stack<>();
        }

        public void push(int val) {
            st.push(val);
            if( minstack.isEmpty()|| minstack.peek()>=val){
                minstack.push(val);
            }
        }

        public void pop() {
            if(!st.isEmpty()){
                if(!minstack.isEmpty() && st.peek().equals(minstack.peek())){ //Java caches Integer objects only from -128 to 127. hence we have used .equals() instead of "=="
                    minstack.pop();
                }
                st.pop();
            }
        }

        public int top() {
            return st.peek();
        }

        public int getMin() {
            return minstack.peek();
        }
    }
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(10);
        obj.push(5);
        obj.push(12);
        obj.pop();
        int param_3 = obj.top();
        int param_4 = obj.getMin();
        System.out.println(param_3);
        System.out.println(param_4);
    }
}
