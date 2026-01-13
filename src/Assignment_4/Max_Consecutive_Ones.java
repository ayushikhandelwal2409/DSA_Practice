package Assignment_4;

public class Max_Consecutive_Ones {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k=3;
        System.out.println(longestOnes(nums,k));
    }
    public static int longestOnes(int[] nums, int k) {
        int c=0;
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int start=0;
        for (int i = 0; i < n; i++) {
            if(nums[i]==0){
                c++;
            }
            while(c>k && start<=i){
                if(nums[start]==0){
                    c--;
                }
                start++;
            }
            max=Math.max(max,i-start+1);
        }
        return max;
    }
}

//Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
//Output: 10
//tc==>O(n)
//sc==>O(1)