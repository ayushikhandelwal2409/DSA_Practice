package merge;

public class special_sort {
    public static int[] print(int[] arr,int val,int s,int e) {
        int idx=s;
        for (int i = s; i < e; i++) {
            if(arr[i]<=val){
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
                idx++;
            }
        }
        arr[e]=arr[idx];
        arr[idx]=val;

        return arr;
    }
    public static void main(String[] args){
        int[] a = {7, 2, 1, 8, 3, 4, 5};
        int val = a[a.length - 1];
        int[] arr = print(a, val, 0, a.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
//code to group all smaller element from last element on the left side of it and
//all larger element from last element on the right side of it
//(group of smaller elements)  last element  (group of larger elements)