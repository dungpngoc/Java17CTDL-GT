package day13;

import java.util.*;

public class MyGraph {
    public static void main(String[] args) {
        int[][] graph = {
                {0, 1, 0, 0, 0, 0, 0},
                {1, 0, 1, 1, 1, 0, 0},
                {0, 1, 0, 0, 0, 1, 0},
                {0, 1, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        };
    }

    private static void DPS_stack(int[][] graph) {
        Stack<Integer> stack = new Stack<>();
        // add đỉnh đầu tiên
        stack.add(0);
        // đánh dấu 0 đã được duyệt
//        Set<Integer> visited = mew HashSet();
//        visited.add(0);
        boolean[] visited = new boolean[100];


        // duyệt stack đến khi stack rỗng
        while (!stack.empty()) {
            // lấy ra đỉnh ở top
            int u = stack.pop();
            // process đỉnh u
            System.out.println(u + "-");

            // add các đỉnh kề với u vào stack và visit
            for (int v = 0; v < graph.length; v++) {
                if (graph[u][v] == 1 ) {
                    stack.push(v);
                    // đánh dấu v đã được visited
                    visited[v] = true;
                }
            }
        }
    }

    private static void DFS_rec(int[][] graph, Set<Integer> visited, int u) {
        // process
        System.out.println(u + " ");
        for (int v = 0; v < graph.length; v++) {
            if (graph[u][v] == 1 && !visited.contains(v)) {
                visited.add(v);
                DFS_rec(graph,visited,v);
            }
        }
    }

    private static void BFS(int[][] graph) {
        Queue<Integer> queue = new LinkedList<>();
        // thêm đỉnh vào queue
        // đánh dầu đỉnh đã visited
        queue.add(0);
        Set<Integer> visited = new HashSet<>();
        visited.add(0);
        while (!queue.isEmpty()) {
            // lấy đầu queue
            int u = queue.poll();
            // process
            System.out.println(u + " ");

            // add tất cả đỉnh kề của u vào queue
            for (int v = 0; v < graph.length; v++) {
                if (graph[u][v] == 1) {

                }
            }
        }
    }
}
