package phase4.Day1;

public class best_time_to_buy_and_sell_stock {
    public static void main(String[] args) {
        //int[] prices={7,1,5,3,6,4}; //5
        int[] prices={7,6,4,3,1}; //0
        int maxprofit=-1;
        int minstock=Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<minstock){
                minstock=prices[i];
            }
            maxprofit=Math.max(maxprofit,prices[i]-minstock);
        }
        System.out.println(maxprofit);
    }
}
