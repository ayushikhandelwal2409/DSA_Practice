package Assignment_2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class merge_sorted_array {
    public static void main(String[] args) {
        int[] nums1={1,3,3,4,5,6,0,0,0,0,0};
        int n=6;
        int[] nums2={2,4,5,6,8};
        int m=5;
        merge(nums1,nums2,n,m);
        System.out.println(Arrays.toString(nums1));  //[1, 2, 3, 3, 4, 4, 5, 5, 6, 6, 8]

    }
    public static void merge(int[] a,int[] b,int n,int m){
        int i=n-1,j=m-1,k=n+m-1;
        while(i>=0 && j>=0){
            if(a[i]>b[j]){
                a[k]=a[i];
                i--;
            }
            else{
                a[k]=b[j];
                j--;
            }
            k--;
        }
        while(j>=0){
            a[k]=b[j];
            j--;
            k--;
        }
    }
}
//tc=O(n+m)
//sc=O(1)