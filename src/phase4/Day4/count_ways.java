package phase4.Day4;
import java.util.*;

public class count_ways {
    public static void main(String[] args) {
        int n=5;
        int[] arr={3, 0, 3, 0, 3};
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println(helper(n,arr,sum));

    }
    public static int helper(int n,int[] arr,int sum){
        if(sum%3!=0){
            return 0;
        }
        int tar=sum/3;
        int goal=tar*2;
        int firstcut=0;
        int seccut=0;
        int pref=0;
        for(int i=0;i<n;i++){
            pref+=arr[i];
            if(pref==tar){
                firstcut++;       //as first cut can vary
            }
            if(pref==goal){
                seccut+=firstcut; //so whenever our secnd cut vary we will add firstcut each time
            }

        }
        return seccut;
    }
}
//problem
//Given an array consisting of n integers. Count number of ways to partition array into 3 non-empty contiguous parts such that sum of each parts are equal.
//
//Input :
//
//First Input is the size of array N, second input is N integers.
//
//Output:
//
//Return a single integer representing number of ways.
//
//Constraints:
//
//1. 1 <= N <= 5 * 10^5
//
//2. Array[i]  <= 10e9.
//5
//1 2 3 0 3
//Sample Output
//2