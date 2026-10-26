class Solution {

    private long sum ;

    private void dfs(int[][] grid, int r, int c) {
        int n = grid.length;
        int m = grid[0].length;
        if(r >= n || r < 0 || c >= m || c < 0 || grid[r][c] == 0){
            return;
        }
        
        sum += grid[r][c];
        grid[r][c] = 0;

        dfs(grid, r, c-1);
        dfs(grid, r-1, c);
        dfs(grid, r, c+1);
        dfs(grid, r+1, c);

    }

    public int countIslands(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int result = 0;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++){
                if(grid[i][j] != 0){
                    sum = 0;
                    dfs(grid, i, j);
                    if(sum % k == 0){
                        result++;
                    }
                }
                
            }
        }
        return result;
    }
}