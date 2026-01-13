package Graph_bhaiya;
import java.util.PriorityQueue;

public class the_maze_2 { //leetcode
    //        l   u   r  d
    static int[] dir = {0, -1, 0, 1, 0};

    public static int solve(int[][] maze, int[] s, int[] d) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[2]-b[2]);// sort on the basis of cost
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        pq.add(new int[]{s[0], s[1], 0});

        while(!pq.isEmpty()){
            // remove
            int[] curr = pq.poll();

            // ignore if vis
            if(visited[curr[0]][curr[1]]) continue;

            // mark vis
            visited[curr[0]][curr[1]] = true;

            // self work
            if(curr[0] == d[0] && curr[1] == d[1]) { // if reach destination
                return curr[2];
            }

            // add nbrs
            for (int i = 0; i < 4; i++) {
                int x = curr[0];;
                int y = curr[1];

                while(x + dir[i] >= 0 && x + dir[i] < maze.length && y + dir[i+1] >= 0 && y + dir[i+1]   <  maze[0].length && maze[x+dir[i]][y+dir[i+1]] == 0){
                    x += dir[i]; // go until there is no wall
                    y += dir[i+1];
                }
                if(x != curr[0] || y != curr[1]){
                    int cost = Math.abs(x - curr[0]) + Math.abs(y - curr[1]);
                    pq.add(new int[]{x, y, curr[2] + cost});
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[][] arr = {{0,0,1,0,0},{0,0,0,0,0},{0,0,0,1,0},{1,1,0,1,1},{0,0,0,0,0}};
        int[] start = {0,4};
        int[] dest = {4,4};
        System.out.println(solve(arr, start, dest));

    }
}