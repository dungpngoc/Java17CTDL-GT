package day13;

import java.util.LinkedList;
import java.util.Queue;

public class LC200_NumberofIslands {
    public int numIslands(char[][] grid) {
        int count = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    // duyệt
                    // DPS || BFS
                    DFS(grid, visited, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isNotValid(char[][] grid, boolean[][] visited, int x, int y) {
        return x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == '0' || visited[x][y];
    }

    private void DFS(char[][] grid, boolean[][] visited, int x, int y) {
        if (isNotValid(grid, visited, x, y)) {
            return;
        }
        // process
        visited[x][y] = true;

        // lần lượt xét 4 đỉnh có liên kết với đỉnh hiện tại dựa trên toạ độ x và y
        DFS(grid, visited, x - 1, y);
        DFS(grid, visited, x + 1, y);
        DFS(grid, visited, x, y + 1);
        DFS(grid, visited, x, y - 1);
    }


    private void BFS(char[][] grid, boolean[][] visited, int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});
        visited[x][y] = true;
        int[][] direction = {
                {0,1},      // x = x + 0; y = y + 1
                {0,-1},     // x = x + 0; y = y - 1
                {1,0},      // x = x + 1; y = y + 0
                {-1,0},     // x = x - 1; y = y + 0
        };

        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            int currX = point[0];
            int currY = point[1];

            for (int i = 0; i < direction.length; i++) {
                int newX = direction[i][0] + currX;
                int newY = direction[i][1] + currY;
                if (isNotValid(grid,visited,newX,newY)) {
                    continue;
                }
                queue.add(new int[]{newX,newY});
                visited[newX][newY] = true;
            }
        }
    }
}
