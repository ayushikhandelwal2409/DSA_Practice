package Assignment_1;

import java.util.Arrays;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public static void main(String[] args) {
        int[] arr={1,2,4,4,5,6,7,7,7,7,9};
        int ele=7;
        int fir=firsearch(arr,ele);
        int last=lastsearch(arr,ele);
        System.out.println(Arrays.toString(new int[]{fir,last}));//{6,9}
    }
    public static int firsearch(int[] arr,int k){
        int s=0;
        int e=arr.length-1;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==k){
                ans=mid;
                e=mid-1;
            }
            else if(arr[mid]>k){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
    public static int lastsearch(int[] arr,int k){
        int s=0;
        int e=arr.length-1;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==k){
                ans=mid;
                s=mid+1;
            }
            else if(arr[mid]>k){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
}


//tc==>O(log n)
// using binary search 2 times =>O(log n)+O(log n) = 2 O(log n); on dropping constants we get, O(log n)


//sc==>O(1)
//few variables are used only