package Assignment_1;
import java.util.*;

public class Minimum_Number_of_Arrows_to_Burst_Balloons {
    public static void main(String[] args) {
        int[][] points={{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        System.out.println(findMinArrowShots(points));//2
    }
    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b)-> Integer.compare(a[1],b[1]));
        int ans = 1;
        int prev = points[0][1];
        for(int i=1; i<points.length; i++){
            if(prev < points[i][0]){
                ans++;
                prev = points[i][1];
            }
        }
        return ans;
    }
}
//tc==> O(N log N + N) = O(N log N)
//as sorting takes ( log n ) time for each ballon  and for loop runs n time
//sc==>O(n) as arrays.sort() uses extra space