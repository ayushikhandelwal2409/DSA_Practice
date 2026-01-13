package Dynamic_Programming;
import java.util.*;
public class MCM {  // matrix chain multiplication
    public static void main(String[] args) {
        int[] arr={4,2,3,5,1};//29
        int[][] dp=new int[arr.length][arr.length];
        for (int[] k:dp) {
            Arrays.fill(k,0);
        }
        System.out.println(mcm(arr,0,arr.length-1,dp));
    }
    public static int mcm(int[] arr,int i,int j,int[][] dp){
        if(i+1==j){
            return 0;
        }
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        int ans=Integer.MAX_VALUE;
        for (int k = i+1; k <=j-1; k++) {
            int fs=mcm(arr,i,k,dp);//[i*k]
            int ss=mcm(arr,k,j,dp);//[k*j]
            int self=arr[i]*arr[j]*arr[k];   //[[i*k]*[k*j]]
            ans=Math.min(ans,fs+ss+self);
        }
        return dp[i][j]=ans;
    }
}
