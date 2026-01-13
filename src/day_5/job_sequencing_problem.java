package day_5;
import  java.util.*;

public class job_sequencing_problem {
    public static void main(String[] args) {
       int[] deadline= {4, 1, 1, 1};
       int[] profit={20, 10, 40, 30};
        System.out.println(jobSequencing(deadline,profit));

    }
    public static ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        int n = profit.length;
        int[][] jobs = new int[n][2];
        for (int i = 0; i < n; i++) {
            jobs[i][0] = profit[i];
            jobs[i][1] = deadline[i];
        }

        Arrays.sort(jobs, (a, b) -> b[0] - a[0]);

        int maxDeadline = 0;
        for (int d : deadline) {
            maxDeadline = Math.max(maxDeadline, d);
        }

        int[] parent = new int[maxDeadline + 1];
        for (int i = 0; i <= maxDeadline; i++) parent[i] = i;

        int totalProfit = 0;
        int jobCount = 0;

        for (int i = 0; i < n; i++) {
            int prof = jobs[i][0];
            int dl = jobs[i][1];

            int availableSlot = find(parent, dl);
            if (availableSlot > 0) {
                totalProfit += prof;
                jobCount++;
                parent[availableSlot] = find(parent, availableSlot - 1);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(jobCount);
        result.add(totalProfit);
        return result;
    }
    private static int find(int[] parent, int s) {
        if (parent[s] == s) return s;
        return parent[s] = find(parent, parent[s]);
    }
}

//You are given two arrays: deadline[], and profit[], which represent a set of jobs, where each job is associated with a deadline, and a profit. Each job takes 1 unit of time to complete, and only one job can be scheduled at a time. You will earn the profit associated with a job only if it is completed by its deadline.
//
//Your task is to find:
//
//The maximum number of jobs that can be completed within their deadlines.
//The total maximum profit earned by completing those jobs.

//Input: deadline[] = [4, 1, 1, 1], profit[] = [20, 10, 40, 30]
//Output: [2, 60]
//Explanation: Job1 and Job3 can be done with maximum profit of 60 (20+40).