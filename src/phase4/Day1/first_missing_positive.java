package phase4.Day1;

public class first_missing_positive {
    public static void main(String[] args) {
        int[] nums={3, 4, -1, 1};  //2
        int n=nums.length;
        int[] arr=new int[n+1];
        for(int i:nums){
            if(i>0 && i<=n) arr[i]=1;
        }
        boolean k=true;
        for (int i = 1; i <=n; i++) {
            if(arr[i]!=1) {
                System.out.println(i);
                k=false;
                break;
            }
        }
        if(k) System.out.println(n+1);

    }
}
