import java.util.*;

public class practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        int c=0;
        int sum=0;
        int leftover=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]<=leftover) {
                sum += arr[i];
                leftover=m-sum;
            }
            else{
                c++;
                leftover=0;
                sum=arr[i];
                leftover=m-sum;
            }
        }
        System.out.println(c);
    }
}
