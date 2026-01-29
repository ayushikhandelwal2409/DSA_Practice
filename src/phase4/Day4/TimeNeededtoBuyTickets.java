package phase4.Day4;
import java.util.*;

public class TimeNeededtoBuyTickets {
    public static void main(String[] args) {
        int[] tickets = {2,3,2};
        int k  = 2;
        System.out.println(timeRequiredToBuy(tickets,k));//6
    }
    public static int timeRequiredToBuy(int[] tickets, int k) {
        int ans=0;
        for(int i=0;i<tickets.length;i++){
            if(i<=k){
                ans+=Math.min(tickets[k],tickets[i]);
            }
            else{
                ans+=Math.min(tickets[k]-1,tickets[i]);
            }
        }
        return ans;
    }
}
