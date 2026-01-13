package graph;

import java.util.Arrays;

//You are given an weighted directed graph, represented by an adjacency matrix, dist[][] of size n x n, where dist[i][j] represents the weight of the edge from node i to node j. If there is no direct edge, dist[i][j] is set to a large value (i.e., 108) to represent infinity.
//The graph may contain negative edge weights, but it does not contain any negative weight cycles.
//
//Your task is to find the shortest distance between every pair of nodes i and j in the graph.
//
//        Note: Modify the distances for every pair in place.



public class FloydWarshallAlgorithm {
    public static void main(String[] args) {
        double[][] dist = {
                {0, 4, 1e8, 5, 1e8},
                {1e8, 0, 1, 1e8, 6},
                {2, 1e8, 0, 3, 1e8},
                {1e8,1e8, 1, 0, 2},
                {1,1e8,1e8, 4, 0}
        };
        shortest_distance(dist);
        for (int i = 0; i < dist.length; i++) {
            int[] intArray = new int[dist.length];

            for (int j = 0; j < dist.length; j++) {
                intArray[j] = (int) dist[i][j]; // Typecasting double to int
            }
            System.out.println(Arrays.toString(intArray));
        }

        check(dist);
    }
    public static void shortest_distance(double[][] matrix){
        int n= matrix.length;
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <n ; j++) {
                    if (matrix[i][k] < 1e8 && matrix[k][j] < 1e8){
                        matrix[i][j] = Math.min(matrix[i][k] + matrix[k][j], matrix[i][j]);
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1e8) {
                    matrix[i][j] = -1;
                }
            }
        }
    }
    public static void check(double[][] dist){
        // check for negative cycles
        for (int i = 0; i < dist.length; i++) {
            if (dist[i][i] < 0) {
                System.out.println("Negative cycle detected involving vertex " + i);
                return; // Exit after finding one negative cycle
            }
        }
        System.out.println("No negative cycles detected.");
    }
}
//output
//[0, 4, 5, 5, 7]
//[3, 0, 1, 4, 6]
//[2, 6, 0, 3, 5]
//[3, 7, 1, 0, 2]
//[1, 5, 5, 4, 0]

//Check for Negative Cycles: After the algorithm completes, iterate through the diagonal elements of the dist matrix.
// If dist[i][i] < 0 for any vertex i, it signifies the presence of a negative cycle reachable from and to vertex i.
// This occurs because traversing a negative cycle repeatedly would result in an increasingly negative path length,
// making the shortest path from a node to itself negative.