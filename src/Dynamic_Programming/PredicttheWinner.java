package Dynamic_Programming;
import  java.util.*;
public class PredicttheWinner {
    public static void main(String[] args) {
        int[] arr={2,3,1,4};//7
        int[][] dp=new int[arr.length][arr.length];
        for(int[] k:dp) {
            Arrays.fill(k, -1);
        }
        System.out.println(optimal(arr,0,arr.length-1,dp));
    }
    public static int optimal(int[] arr,int i,int j,int[][] dp){
        if(i>j) return 0;
        if(dp[i][j]!=-1) {
            return dp[i][j];
        }

        int fchoice=arr[i]+Math.min(optimal(arr,i+2,j,dp), optimal(arr,i+1,j-1,dp));
        int lchoice=arr[j]+Math.min(optimal(arr,i+1,j-1,dp), optimal(arr,i,j-2,dp));
        return dp[i][j]=Math.max(fchoice, lchoice);
    }
}
