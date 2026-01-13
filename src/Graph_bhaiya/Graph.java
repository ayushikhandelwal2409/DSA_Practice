package Graph_bhaiya;
import java.util.*;

import java.util.*;

public class Graph {
    private HashMap<Integer, HashMap<Integer, Integer>> map;

    public Graph(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public boolean ContainsEdge(int v1, int v2) {
        return map.get(v1).containsKey(v2);
    }

    public boolean ContainsVertex(int v) {
        return map.containsKey(v);
    }

    public int noofEdge() {
        int sum = 0;
        for (int vtx : map.keySet()) {
            sum += map.get(vtx).size();
        }
        return sum / 2;
    }

    public void removeEdge(int v1, int v2) {
        map.get(v1).remove(v2);
        map.get(v2).remove(v1);
    }

    public void removeVertex(int v1) {
        for (int nbr : map.get(v1).keySet()) {
            map.get(nbr).remove(v1);
        }
        map.remove(v1);
    }

    public void Display() {
        for (int v : map.keySet()) {
            System.out.println(v + " -> " + map.get(v));
        }
    }

    // ✅ Corrected HasPath (with visited set)
    private boolean HasPath(int src, int des, HashSet<Integer> visited) {
        if (src == des) return true;

        visited.add(src);

        for (int nbr : map.get(src).keySet()) {
            if (!visited.contains(nbr)) {
                boolean ans = HasPath(nbr, des, visited);
                if (ans) return true;
            }
        }
        return false;
    }

    public boolean HasPath(int src, int des) {
        return HasPath(src, des, new HashSet<>());
    }
}

