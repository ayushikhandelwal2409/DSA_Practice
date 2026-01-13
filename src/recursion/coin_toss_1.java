package recursion;

public class coin_toss_1 {
    public static void main(String[] args) {
        int n=3;

        cointoss(n,"");
    }
    public static void cointoss(int n,String ans){
        if(n==0) {
            System.out.print(ans+" ");
            return;
        }
        cointoss(n-1,"H"+ans);
        cointoss(n-1,"T"+ans);
    }
}
