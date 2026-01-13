package faltu;

import java.util.*;
public class Wave_matrix {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] nums = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[i][j]=in.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < m; i++) {
            if(i%2==0){
                for (int j = 0; j < n; j++) {
                    System.out.print(nums[j][i] + " ");
                }
            }
            else{
                for (int j = n-1; j>=0; j--) {
                    System.out.print(nums[j][i]+" ");
                }
            }
        }
    }
}
