package phase4.Day1;
import java.util.*;
public class Sum_3 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        Arrays.sort(nums);
        ArrayList<int[]> ll=new ArrayList<>();
        int i=0;
        while(i<nums.length-2){
            int j=i+1;
            if(i>0 && nums[i]==nums[i-1]){
                i++;
                continue;
            }
            int k=nums.length-1;
            while(j<k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    ll.add(new int[]{nums[i], nums[j], nums[k]});
                    while(j<k && nums[j]==nums[j+1]) j++;
                    while(j<k && nums[k-1]==nums[k])k--;
                    j++;
                    k--;
                } else if (nums[i] + nums[j] + nums[k] > 0) {
                    k--;
                } else {
                    j++;
                }
            }
            i++;
        }
        for (int k = 0; k < ll.size(); k++) {
            System.out.println(Arrays.toString(ll.get(k)));
        }
    }
}
//[-1, -1, 2]
//[-1, 0, 1]
