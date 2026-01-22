package phase4.Day3;
import java.util.*;

public class OnlineStockSpan {
    static class StockSpanner {
        Stack<int[]> st;
        public StockSpanner() {
            st=new Stack<>();

        }
        public int next(int price) {
            int span=1;
            while(!st.isEmpty() && st.peek()[0]<=price){
                int k=st.pop()[1];
                span+=k;
            }
            if(st.isEmpty() || st.peek()[0]>price){
                st.push(new int[]{price,span});
            }
            return span;
        }
    }

    public static void main(String[] args) {
        StockSpanner obj = new StockSpanner();
        int[] arr={100,80,60,70,60,75,85};
        int[] ans=new int[7];
        int k=0;//index
        for(int i:arr){
            ans[k]=obj.next(i);
            k++;
        }
        System.out.println(Arrays.toString(ans));//[1, 1, 1, 2, 1, 4, 6]
    }
}
