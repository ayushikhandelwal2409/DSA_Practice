package Assignment_2;
import java.util.*;

public class kth_largest_element {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(nums, k)); // Output: 5
    }
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // removing smallest
            }
        }
        return minHeap.peek();
    }
}
//sc=>O(k)
//because of priority queue of size k
//tc=>O(n.log k)
//doing push and pop operation in heap of size k for the array of size n

//###########  IMPORTANT #####################################
//The time complexity of push (insertion) and pop (deletion of the highest priority element)
// operations in a standard priority queue, which is typically implemented using a binary heap, is O(logN).
//################