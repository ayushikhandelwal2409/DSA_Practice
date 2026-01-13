package backtracking;

public class infinite_supply_of_coins_permutation {
    public static void main(String[] args) {
        int[] coin={1,2,3,5};
        int amount=5;
        infinite(coin,amount,"");

    }
    public static void infinite(int[] coin,int amount,String ans){
        if(amount==0){
            System.out.print (ans+" ");
            return;
        }
        for (int i = 0; i < coin.length; i++) {
            if(amount>=coin[i]) {
                System.out.println(ans + coin[i]);
                infinite(coin, amount - coin[i], ans + coin[i]);
            }
        }
    }
}
