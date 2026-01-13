package backtracking;
import java.util.*;

public class rat_in_a_maze {
    public static void main(String[] args) {
        int[][] maze = {{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}};
        System.out.println(ratInMaze(maze));
    }
    public static ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String> ans=new ArrayList<>();
        int n=maze.length;
        boolean[][] vis=new boolean[n][n];
        if (maze[0][0] == 1) {
            dfs(0, 0, maze, vis, "", n, ans);
        }
        return ans;
    }
    public static void dfs(int row,int col,int[][] maze,boolean[][] vis,String cur,int n,ArrayList<String> ans){
        if(row==n-1 && col==n-1) {
            ans.add(cur);
            return;
        }
        if (col < 0 || row < 0 || row >= n || col >= n || maze[row][col] == 0 || vis[row][col]) {
            return;
        }
        int[] rdir = {1, 0, 0, -1};
        int[] cdir = {0, -1, 1, 0};
        char[] dir = {'D', 'L', 'R', 'U'};
        vis[row][col] = true;

        for (int k = 0; k < 4; k++) {
            int newRow = row + rdir[k];
            int newCol = col + cdir[k];
            dfs(newRow, newCol, maze, vis, cur + dir[k],n, ans);
        }

        // Backtrack
        vis[row][col] = false;

    }
}
//Consider a rat placed at position (0, 0) in an n x n square matrix maze[][]. The rat's goal is to reach the destination at position (n-1, n-1). The rat can move in four possible directions: 'U'(up), 'D'(down), 'L' (left), 'R' (right).
//The matrix contains only two possible values:
//0: A blocked cell through which the rat cannot travel.
//1: A free cell that the rat can pass through.
//Your task is to find all possible paths the rat can take to reach the destination, starting from (0, 0) and ending at (n-1, n-1), under the condition that the rat cannot revisit any cell along the same path. Furthermore, the rat can only move to adjacent cells that are within the bounds of the matrix and not blocked.
//If no path exists, return an empty list.

//Note: Return the final result vector in lexicographically smallest order.

//Input: maze[][] = [[1, 0, 0, 0], [1, 1, 0, 1], [1, 1, 0, 0], [0, 1, 1, 1]]
//Output: ["DDRDRR", "DRDDRR"]