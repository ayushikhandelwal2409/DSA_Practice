package phase4.Day1;

public class Median_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        int i=0;
        int j=0;
        int n=nums1.length;
        int m=nums2.length;
        int[] merge=new int[n+m];
        int k=0;
        while(i<n && j<m){
            if(nums1[i]==nums2[j]){
                merge[k]=nums1[i];
                i++;
            }
            else if(nums1[i]<nums2[j]){
                merge[k]=nums1[i];
                i++;
            }
            else{
                merge[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<n){
            merge[k]=nums1[i];
            i++;
            k++;
        }
        while(j<m){
            merge[k]=nums2[j];
            j++;
            k++;
        }
        int len=n+m;
        if(len%2==0){
            System.out.println((merge[len/2]+merge[len/2-1])/2.0);
        }
        else{
            System.out.println(merge[len/2]);
        }
    }
}
