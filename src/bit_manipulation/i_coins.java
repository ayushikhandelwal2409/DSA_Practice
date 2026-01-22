package bit_manipulation;

import java.util.Arrays;

public class i_coins {
    public static void main(String[] args) {
        double[] p={0.3,0.6,0.8};
        int n=p.length;
        double[][] dp=new double[(n+1/2)+1][n+1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i],-1.0);
        }
        System.out.println(probability(p,(n+1)/2,0,dp));
    }
    public static double probability(double[] p,int h,int i,double[][] dp){
        if(h==0) return 1.0;
        if(i==p.length){
            return 0.0;
        }
        if(dp[h][i]!=-1.0) return dp[h][i];
        double take_h=p[i]*probability(p,h-1,i+1,dp);
        double take_t=(1.0-p[i])*probability(p,h,i+1,dp);
        return dp[h][i]=take_t+take_h;
    }
}
