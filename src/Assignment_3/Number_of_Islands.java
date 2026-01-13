package Assignment_3;
import java.util.*;

public class Number_of_Islands {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();  // rows
        int m = in.nextInt();  // cols

        char[][] grid = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = in.next().charAt(0); // input as '0' or '1'
            }
        }

        int[][] vis = new int[n][m];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (vis[i][j] == 0 && grid[i][j] == '1') {
                    cnt++;
                    dfs(i, j, grid, vis);
                }
            }
        }
        System.out.println(cnt);
    }

    public static void dfs(int r, int c, char[][] arr, int[][] vis) {
        int n = arr.length;
        int m = arr[0].length;

        if (r < 0 || r >= n || c < 0 || c >= m || vis[r][c] == 1 || arr[r][c] == '0') {
            return;
        }

        vis[r][c] = 1;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        for (int i = 0; i < 4; i++) {
            int nrow = r + dr[i];
            int ncol = c + dc[i];
            dfs(nrow, ncol, arr, vis);
        }
    }
}


//4 5

//1 1 0 0 0
//1 1 0 0 0
//0 0 1 0 0
//0 0 0 1 1

// ans=>3

//tc=>O(n*m)
//sc=>O(n*m)