package Assignment_7;

import java.util.*;

public class House_Robber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        System.out.println(total_amount(nums,0,dp));
    }
    public static int total_amount(int[] nums,int idx,int[] dp){
        if(idx>=nums.length){
            return 0;
        }
        if(dp[idx]!=-1) return dp[idx];
        int rob=nums[idx]+total_amount(nums,idx+2,dp);
        int dont_rob=total_amount(nums,idx+1,dp);
        return dp[idx]=Math.max(rob,dont_rob);
    }
}
//Input: nums = [1,2,3,1]
//Output: 4
//tc=>O(n)
//sc=>O(n)