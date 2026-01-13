package faltu;

import java.util.Scanner;

public class Subtract_Min_Sort {
    public static void solve() {
        Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=in.nextInt();
            }
            for (int j = 0; j < n-1; j++) {
                int min=Math.min(arr[j],arr[j+1]);
                arr[j]=arr[j]-min;
                arr[j+1]=arr[j+1]-min;
                if(arr[j]>arr[j+1]) {
                    System.out.println(false);
                    return;
                }
            }
            System.out.println(true);
        }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            solve();
        }
    }
}
