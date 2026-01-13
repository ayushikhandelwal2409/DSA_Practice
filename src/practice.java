import java.util.*;

public class practice {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int[][] arr=new int[n][5];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 5; j++) {
                    arr[i][j]=in.nextInt();
                }
            }
            int cand=0;
            for(int i=1;i<n;i++){
                if(isbetter(arr[i],arr[cand])){ //if athlete i is better than athlete cand
                    cand=i;
                }
            }
            boolean check=true;
            for(int i=0;i<n;i++){
                if(i != cand && isbetter(arr[i],arr[cand])){
                    check=false;
                    break;
                }
            }
            if(check) System.out.println(cand+1);
            else System.out.println(-1);
        }
    }
    public static boolean isbetter(int[] a ,int[] b){
        int cnt=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<b[i]) cnt++;
        }
        return cnt>=3;
    }
}
