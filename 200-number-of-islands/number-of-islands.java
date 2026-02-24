class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int rows = grid.length;
        int cols = grid[0].length;
        for(int r = 0;r<rows;r++){
            for(int c = 0;c<cols;c++){
                if (grid[r][c] == '1' && !visited[r][c]){
                    dfs(grid,r,c,visited);
                    islands++;
                }
            }
        }
        return islands;
    }

    private void dfs(char[][] grid,int row, int col, boolean[][] visited){
        if(row<0 || col <0 || row>=grid.length || col>=grid[0].length || visited[row][col]==true || grid[row][col]=='0') return;
        visited[row][col] = true;
        dfs(grid,row+1,col,visited);
        dfs(grid,row-1,col,visited);
        dfs(grid,row,col+1,visited);
        dfs(grid,row,col-1,visited);

    }
   
}