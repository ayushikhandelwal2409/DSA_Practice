package Assignment_10;
import java.util.*;
public class next_greater_elementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        int nextGreater[] = new int[nums2.length];
        Stack<Integer> s = new Stack<>();
        for(int i=nums2.length-1; i>=0; i--){
            while(!s.isEmpty() && nums2[i] >= nums2[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = nums2[s.peek()];
            }
            s.push(i);
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nextGreater.length; i++){
            map.put(nums2[i],nextGreater[i]);
        }

        for(int i=0; i<nums1.length; i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}
//Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
//Output: [-1,3,-1]
//Time: O(m+n)
//Space: O(n)