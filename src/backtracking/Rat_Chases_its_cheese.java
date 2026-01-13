package backtracking;

import java.util.Scanner;

public class Rat_Chases_its_cheese {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        char[][] maze = new char[n][m];
        for (int i = 0; i < maze.length; i++) {
            String s = in.next();
            for (int j = 0; j < maze[0].length; j++) {
                maze[i][j] = s.charAt(j);
            }
        }
        int[][] ans = new int[n][m];
        print(maze, 0, 0, ans);
        if (!val) {
            System.out.println("path not found");
        }
    }

    static boolean val = false;

    public static void print(char[][] maze, int cc, int cr, int[][] ans) {
        // Check for out of bounds or blocked cell
        if (cc < 0 || cr < 0 || cr >= maze.length || cc >= maze[0].length || maze[cr][cc] == 'X') {
            return;
        }

        // Check if the destination is reached
        if (cr == maze.length - 1 && cc == maze[0].length - 1) {
            ans[cr][cc] = 1;
            val = true;
            display(ans);
            return; // Stop after finding the first path
        }

        // Mark the cell as visited
        maze[cr][cc] = 'X';
        ans[cr][cc] = 1;

        // Explore all possible directions
        print(maze, cc, cr - 1, ans); // Up
        print(maze, cc - 1, cr, ans); // Left
        print(maze, cc + 1, cr, ans); // Right
        print(maze, cc, cr + 1, ans); // Down

        // Backtrack
        maze[cr][cc] = 'O';
        ans[cr][cc] = 0;

    }

    public static void display(int[][] ans) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//5 4
//OXOO
//OOOX
//XOXO
//XOOX
//XXOO


