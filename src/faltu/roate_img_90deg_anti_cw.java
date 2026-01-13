package faltu;

import java.util.Scanner;

public class roate_img_90deg_anti_cw {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] nums = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] = in.nextInt();
            }
        }

        int max_col = n - 1;
        while (max_col >= 0) {
            for (int i = 0; i < n; i++) {
                System.out.print(nums[i][max_col] + " ");
            }
            max_col--;
            System.out.println();
        }
    }
}
