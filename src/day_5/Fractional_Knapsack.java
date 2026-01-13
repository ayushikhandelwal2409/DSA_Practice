package day_5;
import java.util.*;

//Given two arrays, val[] and wt[] , representing the values and weights of items, and an integer capacity representing the maximum weight a knapsack can hold, determine the maximum total value that can be achieved by putting items in the knapsack. You are allowed to break items into fractions if necessary.
//Return the maximum value as a double, rounded to 6 decimal places.

public class Fractional_Knapsack {
    public static void main(String[] args) {
        int[] val={60,100,120};
        int[] wt={10,20,30};
        int capacity=50;
        System.out.println(fractionalKnapsack(val,wt,capacity));
    }
    public static double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code
        int n=val.length;
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]= val[i];
            arr[i][1]=wt[i];
        }
        Arrays.sort(arr, (a, b) -> {
            double r1 = (double) a[0] / a[1];
            double r2 = (double) b[0] / b[1];
            return Double.compare(r2, r1); // descending
        });
        double ans=0.0;
        int cur_cap=0;
        for(int i=0;i<n && cur_cap<capacity;i++){
            if(cur_cap+arr[i][1]<=capacity){
                cur_cap+=arr[i][1];
                ans+=arr[i][0];
            }
            else{
                double cost_of_one=(double)arr[i][0]/(arr[i][1]*1.0);
                ans+=(capacity-cur_cap)*cost_of_one;
                break;
            }
        }
        return ans;
    }
}
//Input: val[] = [60, 100, 120], wt[] = [10, 20, 30], capacity = 50
//Output: 240.000000
//Explanation: By taking items of weight 10 and 20 kg and 2/3 fraction of 30 kg. Hence total price will be 60+100+(2/3)(120) = 240