class Solution {

    private void dfs(char[][]board, int row, int col, int[] delrow, int[] delcol, int[][] vis){
        //mark visited
        vis[row][col] = 1;

        int m = board.length;
        int n = board[0].length;

        //check top, right, bottom, left 
        for(int i=0; i<4; i++){
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];
            //boundary coundation 
            if(nrow >= 0 && nrow < m && ncol >= 0 && ncol < n && board[nrow][ncol] == 'O' && vis[nrow][ncol] == 0){
                dfs(board, nrow, ncol, delrow, delcol, vis);
            }

        }
        
    }

    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        int[][] vis = new int[m][n];
        int[] delrow = {1, 0, -1, 0};
        int[] delcol = {0, 1, 0, -1};

        for(int i=0; i<n; i++){
            //first row
            if(board[0][i] == 'O'){
                dfs(board, 0, i, delrow, delcol, vis);
            }
            //last row
            if(board[m-1][i] == 'O'){
                dfs(board, m-1, i, delrow, delcol, vis);
            }
        }
        for(int i=0; i<m; i++){
            //first column
            if(board[i][0] == 'O'){
                dfs(board, i, 0, delrow, delcol, vis);
            }

            //last column
            if(board[i][n-1] == 'O'){
                dfs(board, i, n-1, delrow, delcol, vis);
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(vis[i][j] == 0 && board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }
    }
}