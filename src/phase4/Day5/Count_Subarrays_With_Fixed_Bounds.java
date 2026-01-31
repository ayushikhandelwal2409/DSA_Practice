package phase4.Day5;
import java.util.*;

public class Count_Subarrays_With_Fixed_Bounds {
    public static void main(String[] args) {
        int[] nums = {1,3,5,2,7,5};
        int minK = 1, maxK = 5;
        System.out.println(countSubarrays(nums,minK,maxK));//2
    }
    public static long countSubarrays(int[] nums, int minK, int maxK) {
        int mink=-1;
        int maxk=-1;
        int start=-1;
        int i=0;
        int n=nums.length;
        long ans=0;
        while(i<n){
            if (nums[i] < minK || nums[i] > maxK) {
                start = i;
                mink=-1;
                maxk=-1;
            }
            if (nums[i] == minK) mink = i;
            if (nums[i] == maxK) maxk = i;

            int valid=Math.min(mink,maxk)-start;
            if(mink!=-1 && maxk!=-1){
                ans+=valid;
            }
            i++;

        }
        return ans;
    }
}
