class Solution {
    public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        // mark bounddary O's
        for(int r = 0;r<rows;r++){
            dfs(board,r,0);
            dfs(board,r,cols-1);
        }
        for(int c= 0;c<cols;c++){
            dfs(board,0,c);
            dfs(board,rows-1,c);
        }
        //flip surrounded regions
        for(int r=0;r<rows;r++){
            for(int c = 0;c<cols;c++){
                if(board[r][c]=='O') board[r][c] ='X';
                if(board[r][c]=='#') board[r][c] ='O';
            }
        }
    }

    private void dfs(char[][] board,int row,int col){
        if(row<0 || col <0|| row>=board.length||col>=board[0].length||board[row][col]!= 'O')return;
        board[row][col] = '#';
        dfs(board,row+1,col);
        dfs(board,row-1,col);
        dfs(board,row,col+1);
        dfs(board,row,col-1);
    }
}