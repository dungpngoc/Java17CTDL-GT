package day13;

import java.util.HashSet;
import java.util.Set;

public class Dijisktra {
    public static void main(String[] args) {
        int[][] graph = {
                {0, 6, 0, 1, 0},
                {6, 0, 5, 2, 2},
                {0, 5, 0, 0, 5},
                {1, 2, 0, 0, 1},
                {0, 2, 5, 1, 0},
        };
        int startPoint = 0;
        int[] distance = new int[graph.length];
        int[] prev = new int[graph.length];
        for (int i = 0; i < distance.length; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        distance[startPoint] = 0;

        Set<Integer> visited = new HashSet<>();
        while (visited.size() < graph.length) {
            // tìm đỉnh có khoảng cách nhỏ nhất đếm startPoint
            int u = findMinDistanceNode(distance, visited);

            // duyệt các đỉnh kề của u
            for (int v = 0; v < graph.length; v++) {
                if (graph[u][v] != 0) {
                    int newDistanceOfV = distance[u] + graph[u][v];
                    if (newDistanceOfV < distance[v]) {
                        distance[v] = newDistanceOfV;
                        prev[v] = u;
                    }
                }
            }
            visited.add(u);
        }
        int endPoint = 4;
        System.out.println("distance to " + endPoint + " = " + distance[endPoint]);
    }

    private static int findMinDistanceNode(int[] distance, Set<Integer> visited) {
        int index = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < distance.length; i++) {
            if (distance[i] < min && !visited.contains(i)) {
                min = distance[i];
                index = i;
            }
        }
        return index;
    }
}
