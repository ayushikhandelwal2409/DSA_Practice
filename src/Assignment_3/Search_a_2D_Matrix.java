package Assignment_3;

import java.util.Scanner;

public class Search_a_2D_Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int tar = in.nextInt();
        System.out.println(search(arr,tar,n,m));
    }
    public static boolean search(int[][] arr,int tar,int n,int m){
        int s=0;
        int e=m*n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            int midval=arr[mid/m][mid%m];
            if(midval==tar){
                return true;
            }
            else if(midval>tar){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return false;
    }
}

//n=2
//m=3

//1
//2
//3
//4
//5
//6

//tar=3
//true

//tc==>O(log m.n)
//sc==>O(1)
