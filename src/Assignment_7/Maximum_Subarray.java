package Assignment_7;
import java.util.*;

public class Maximum_Subarray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int l=nums.length;
        int sum=0;
        for(int i=0;i<l;i++){
            sum+=nums[i];
            max=Math.max(max,sum);
            if(sum<0)
                sum=0;
        }
        return max;
    }

}
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//tc==>O(n)
//sc==>O(1)