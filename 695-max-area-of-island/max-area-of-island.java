class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1 && !visited[r][c]) {
                    int area = dfs(grid, r, c, visited);
                    maxArea = Math.max(area,maxArea);
                }
            }
        }
        return maxArea;
    }

    private int dfs(int[][] grid, int row, int col, boolean[][] visited) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || visited[row][col] == true
                || grid[row][col] == 0)
            return 0;
        visited[row][col] = true;
        int area = 1;
        area = area +dfs(grid,row+1,col,visited);
        area = area +dfs(grid,row-1,col,visited);
        area = area +dfs(grid,row,col+1,visited);
        area = area +dfs(grid,row,col-1,visited);
        return area;
    }
}