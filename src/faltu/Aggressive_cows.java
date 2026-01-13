package faltu;//AGGRCOW - Aggressive cows
//#binary-search
//
//Farmer John has built a new long barn, with N (2 <= N <= 100,000) stalls. The stalls are located along a straight line at positions x1 ... xN (0 <= xi <= 1,000,000,000).
//
//His C (2 <= C <= N) cows don't like this barn layout and become aggressive towards each other once put into a stall. To prevent the cows from hurting each other, FJ wants to assign the cows to the stalls, such that the minimum distance between any two of them is as large as possible. What is the largest minimum distance?
//
//Input
//t – the number of test cases, then t test cases follows.
//* Line 1: Two space-separated integers: N and C
//* Lines 2..N+1: Line i+1 contains an integer stall location, xi
//
//        Output
//For each test case output one integer: the largest minimum distance.
//
//Example
//Input:
//
//        1
//        5 3
//        1
//        2
//        8
//        4
//        9
//Output:
//
//        3
//Output details:
//
//FJ can put his 3 cows in the stalls at positions 1, 4 and 8,
//resulting in a minimum distance of 3.


import java.util.Arrays;

public class Aggressive_cows {
    public static void main(String[] args) {
        int[] arr={1,2,8,4,9};
        int n=5;
        int noc=3;
        Arrays.sort(arr);
        int x=largest_mininmum(n,arr,noc);
        System.out.println(x);
    }

    public static int largest_mininmum(int n,int[] arr,int noc) {
        int l=0;
        int h=arr[n-1]-arr[0];
        int ans=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(is_it_possible(arr,noc,mid)){
                ans=mid;
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return ans;
    }

    public static boolean is_it_possible(int[] arr,int noc,int mid){
        int pos=arr[0];
        int cow=1;
        for (int i = 1; i <arr.length ; i++) {
            if((arr[i]-pos)>=mid){
                cow++;
                pos=arr[i];
            }
            if(cow==noc) return true;
        }
        return false;
    }
}
