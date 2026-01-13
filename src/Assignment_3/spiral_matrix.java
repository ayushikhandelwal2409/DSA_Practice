package Assignment_3;

import java.util.*;

public class spiral_matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();  // rows
        int m = in.nextInt();  // cols

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        List<Integer> result = spiralOrder(arr, n, m);
        System.out.println(result);
    }

    public static List<Integer> spiralOrder(int[][] matrix, int n, int m) {
        List<Integer> ans = new ArrayList<>();

        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }

        return ans;
    }
}

//n=>3
//m=>4

//1
//2
//3
//4
//5
//6
//7
//8
//9
//10
//11
//12

//[1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]

//tc=O(n+m)
//sc=>O(n+m)==>including result list