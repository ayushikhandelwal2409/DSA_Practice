package merge;

import java.util.Arrays;

public class merge_sort {
    public static void main(String[] args) {
        int[] arr = {1, 13,5, 8, 9, 11, 13,1,0};
        int[] a = merge(arr);
        System.out.println(Arrays.toString(a));
    }
    public static int[] merge(int[] arr) {
        if(arr.length<=1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left= Arrays.copyOfRange(arr,0,mid);
        int[] right=Arrays.copyOfRange(arr,mid,arr.length);
        left = merge(left);
        right = merge(right);
        return Merge_two_array(left,right);
    }

    public static int[] Merge_two_array(int[] left,int[] right) {
        int n=left.length;
        int m= right.length;
        int[] ans=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(left[i]<right[j]){
                ans[k]=left[i];
                i++;
            }
            else{
                ans[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<n){
            ans[k]=left[i];
            i++;
            k++;
        }
        while(j<m){
            ans[k]=right[j];
            j++;
            k++;
        }
        return ans;
    }
}
//merge sort using dnc i.e divide and conquer and recursion