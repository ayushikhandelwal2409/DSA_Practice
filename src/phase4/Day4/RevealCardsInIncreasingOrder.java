package phase4.Day4;
import java.util.*;
public class RevealCardsInIncreasingOrder {
    public static void main(String[] args) {
        int[]  deck = {17,13,11,2,3,5,7};//[2,13,3,11,5,17,7]
        int[] ans=deckRevealedIncreasing(deck);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] deckRevealedIncreasing(int[] deck) {
        int n=deck.length;
        int[] ans=new int[n];
        // ArrayList<Integer> l=new ArrayList<>();
        Arrays.sort(deck);
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            q.add(i);
        }
        int c=0;
        while(!q.isEmpty()){
            int val=q.poll();
            //   l.set(c,val);
            ans[val]=deck[c];
            c++;
            if(!q.isEmpty()){
                q.offer(q.poll());
            }

        }
        return ans;
    }
}
