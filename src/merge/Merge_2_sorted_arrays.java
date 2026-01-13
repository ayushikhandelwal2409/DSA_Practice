package merge;

public class Merge_2_sorted_arrays {
    public static void main(String[] args) {
        int[] arr={2,3,5,7,8};
        int[] arr2={1,3,5,8,9,11,13};
        int[] a=Merge_two_array(arr,arr2);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

    public static int[] Merge_two_array(int[] arr,int[] arr2) {
        int n=arr.length;
        int m= arr2.length;
        int[] ans=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(arr[i]<arr2[j]){
                ans[k]=arr[i];
                i++;
            }
            else{
                ans[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<n){
            ans[k]=arr[i];
            i++;
            k++;
        }
        while(j<m){
            ans[k]=arr2[j];
            j++;
            k++;
        }
        return ans;
    }
}
