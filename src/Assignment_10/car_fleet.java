package Assignment_10;
import java.util.*;

public class car_fleet {
    public static void main(String[] args) {
        int target = 12;
        int[] position = {10,8,0,5,3};
        int[] speed = {2,4,1,1,3};
        System.out.println(carFleet(target,position,speed));
    }
    public static int carFleet(int target, int[] position, int[] speed) {
        int fleets=0;
        Double[][] arr=new Double[position.length][2];
        for (int i = 0; i < position.length; i++) {
            arr[i][0] = Double.valueOf(position[i]);
            arr[i][1] = Double.valueOf(speed[i]);
        }
        Arrays.sort(arr,Comparator.comparingDouble(a->-a[0])); // sort on basis of position in descending order

        double timetoreachtarget=0;
        for (int i = 0; i <position.length; i++) {
            // Calculate time to reach the target for the current car
            double time = (target - arr[i][0]) / arr[i][1];
            // If the current car takes longer than the last car in the fleet,
            // it forms a new fleet
            if (time > timetoreachtarget) {
                fleets++;
                timetoreachtarget = time; // Update the time for the new fleet
            }
        }
        return fleets;
    }
}

//Input: target = 12, position = [10,8,0,5,3], speed = [2,4,1,1,3]
//
//Output: 3
//tc=>0(Nlogn)
//sc=0(n)