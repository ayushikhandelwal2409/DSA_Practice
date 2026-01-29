package phase4.Day4;
import java.util.*;
public class FindtheWinneroftheCircularGame {
    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.println(findTheWinner(n,k));
    }
    public  static int findTheWinner(int n, int k) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.offer(i);
        }
        int c=0;
        while(q.size()>1){
            int val=q.poll();
            c++;
            if(c!=k){
                q.offer(val);
            }
            else if(c==k){
                c=0;
            }
        }
        return q.peek();
    }
}