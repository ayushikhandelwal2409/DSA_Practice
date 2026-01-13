package backtracking;

import java.util.ArrayList;
import java.util.List;

public class infinit_supply_of_coins_combination {
    public static void main(String[] args) {
        int[] coin={1,2,3,5};
        int amount=5;
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        infinite(coin,amount,l,0,ans);
        System.out.println(ans);
    }
    public static void infinite(int[] coin,int amount,List<Integer> l,int idx,List<List<Integer>> ans){
        if(amount==0){
            ans.add(new ArrayList<>(l));
            return;
        }
        for (int i = idx; i < coin.length; i++) {
            if(amount>=coin[i]) {
                l.add(coin[i]);
                infinite(coin, amount - coin[i],l,i, ans);
                l.remove(l.size()-1);
            }
        }
    }
}
