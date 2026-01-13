package faltu;

import java.util.*;

public class Game_of_Mathletes {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int k=in.nextInt();
            int[] arr=new int[n];
            HashMap<Integer, Integer> countMap = new HashMap<>();
            for (int i = 0; i < n; i++) {
                arr[i]=in.nextInt();
                countMap.put(arr[i], countMap.getOrDefault(arr[i], 0) + 1);
            }
            int score = 0;

            for (int a : countMap.keySet()) {
                int b = k - a;
                if (countMap.containsKey(b)) {
                    int pairs = Math.min(countMap.get(a), countMap.get(b));
                    if (a == b) {
                        pairs /= 2;
                    }
                    score += pairs;
                }
            }
            System.out.println(score);
        }
    }
}
