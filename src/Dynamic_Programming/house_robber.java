package Dynamic_Programming;

import java.util.*;

public class house_robber {
    public static void main(String[] args) {
        int[] nums={2,7,9,3,1};
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        //System.out.println(total_amount(nums,0,dp));//12
        //System.out.println(total_amount(nums,0,dp));//12
        System.out.println(robBU(nums));//12
    }
    public static int total_amount(int[] nums,int i,int[] dp){  //{2,7,9,3,1}  in this we will start from first index
        if(i>=nums.length) return 0;   //base case

        if(dp[i]!=-1){
            return dp[i];
        }

        int rob=nums[i]+ total_amount(nums,i+2,dp);
        int dont_rob=total_amount(nums,i+1,dp);
        return dp[i]=Math.max(rob,dont_rob);
    }
    public static int total_amount2(int[] nums,int i,int[] dp){  //{2,7,9,3,1}  in this we will start from last index
         if(i<0) return 0;   //base case

         if(dp[i]!=-1){
             return dp[i];
         }

         int rob=nums[i]+ total_amount2(nums,i-2,dp);
         int dont_rob=total_amount2(nums,i-1,dp);
         return dp[i]=Math.max(rob,dont_rob);
    }
    public static int robBU(int [] arr) {        //bottoms - up approach
        if(arr.length==1) {
            return arr[0];
        }
        int dp[]=new int[arr.length];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0], arr[1]);
        for(int i=2;i<dp.length;i++) {
            int rob=arr[i]+dp[i-2];
            int notrob=dp[i-1];
            dp[i]=Math.max(rob, notrob);
        }
        return dp[dp.length-1];
    }
}
