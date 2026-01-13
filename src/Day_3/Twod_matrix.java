package Day_3;

import java.util.Scanner;

public class Twod_matrix {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for (int j = 0; j < n; j++) {
                arr[i][j]=in.nextInt();
            }
        }
        display_matrix(arr,n);
        System.out.println("row wise");
        row_wise(arr,n);
        System.out.println();
        System.out.println("column wise");
        col_wise(arr,n);
        System.out.println();
        System.out.println("reverse");
        reverse_wise(arr,n);
        System.out.println();
        System.out.println("spiral");
        spiral_wise(arr,n);
        System.out.println();
        System.out.println("zig-zag");
        zig_zag_wise(arr,n);
    }
    public static void display_matrix(int[][] arr,int n){
        for (int i = 0; i < n; i++) {
            System.out.print("[");
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
    public static void row_wise(int[][] arr,int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
        }
    }
    public static void col_wise(int[][] arr,int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j][i]+" ");
            }
        }
    }
    public static void reverse_wise(int[][] arr,int n){
        for (int i = n-1; i >=0; i--) {
            for (int j =n-1; j>=0; j--) {
                System.out.print(arr[i][j]+" ");
            }
        }
    }
    public static void spiral_wise(int[][] arr,int n){  //for square matrix
        int i=0;
        int j=0;
        int iend=n-1;
        int jend=n-1;
        while(i<n && j<n && iend>=0 && jend>=0){
            for (int k = j; k <=jend ; k++) {
                System.out.print(arr[i][k]+" ");
            }
            i++;
            for (int k = i; k <=iend ; k++) {
                System.out.print(arr[k][jend]+" ");
            }
            jend--;
            for (int k = jend; k>=j; k--) {
                System.out.print(arr[iend][k]+" ");
            }
            iend--;
            for (int k =iend; k >=i; k--) {
                System.out.print(arr[k][j]+" ");
            }
            j++;
        }
    }
    public static void zig_zag_wise(int[][] arr,int n){
        for (int i = 0; i < n; i++) {
            if(i%2==0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for (int j=n-1; j>=0; j--) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
