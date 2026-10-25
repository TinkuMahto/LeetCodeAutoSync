class Solution {

    private boolean dfs(int[][] grid, int r, int c) {
        int n = grid.length;
        int m = grid[0].length;

        if(r >= n || r < 0 || c >= m || c < 0) {
            return false;
        }
        if(grid[r][c] == 1) {
            return true;
        }
        grid[r][c] = 1;
        boolean left_closed = dfs(grid, r, c-1);
        boolean top_closed = dfs(grid, r-1, c);
        boolean right_closed = dfs(grid, r, c+1);
        boolean down_closed = dfs(grid, r+1, c);

        return (left_closed && right_closed && top_closed && down_closed);
    }

    public int closedIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == 0){
                    if(dfs(grid, i, j)){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}