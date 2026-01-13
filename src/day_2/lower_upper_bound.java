package day_2;

public class lower_upper_bound {
    public static void main(String[] args) {
        int[] arr={1,2,4,4,4,7,9};
        int target=10;
        System.out.println(firsearch(arr,target));
        System.out.println(uppersearch(arr,target));

    }

    public static int firsearch(int[] arr,int k){
        int s=0;
        int e=arr.length-1;
        if(k<arr[0]){
            return -1 ;
        }
        while(s<e){
            int mid=s+(e-s)/2;
            if(arr[mid]<k){
                s=mid+1;
            }
            else{
                e=mid;
            }
        }
        return s;
    }
    public static int uppersearch(int[] arr,int k){
        int s=0;
        int e=arr.length-1;
        int ans=-1;
        if(k<arr[0]){
            return 0;
        }
        else if(k>arr[arr.length-1]){
            return -1;
        }

        while(s<e){
            int mid=s+(e-s)/2;
            if(arr[mid]<=k){
                s=mid+1;
            }
            else{
                e=mid;
            }
        }
        return s;
    }
}
