package phase4.Day5;
import java.util.*;

public class Longest_Increasing_Subsequence_II {
    public static void main(String[] args) {
        int[] nums = {4,2,1,4,3,4,5,8,15};
        int k = 3;
        System.out.println(lengthOfLIS(nums,k));//5
    }
    public static int lengthOfLIS(int[] nums, int k) {
        int max=0;
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(nums[i]>nums[j] && nums[i]-nums[j]<=k){
                    dp[i]=Math.max(dp[j]+1,dp[i]);
                }
            }
            max=Math.max(max,dp[i]);
        }
        // System.out.println(Arrays.toString(dp));
        return max;
    }
}
