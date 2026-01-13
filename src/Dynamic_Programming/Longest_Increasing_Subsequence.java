package Dynamic_Programming;
import  java.util.*;
public class Longest_Increasing_Subsequence {
    public static void main(String[] args) {
        int[] nums={10,9,2,5,3,7,101,18};
        System.out.println(LIS(nums));
    }
    public static int LIS(int[] arr){
        int[] dp=new int[arr.length];
        Arrays.fill(dp,1);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i-1; j >=0; j--) {
                if(arr[i]>arr[j]) {
                    int val = dp[j];
                    dp[i]=Math.max(dp[i],val+1);
                }
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}
