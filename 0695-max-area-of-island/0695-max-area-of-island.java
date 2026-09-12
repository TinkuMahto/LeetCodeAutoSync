class Solution {
    int m,n;
    public int maxAreaOfIsland(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int maxArea = 0;

        for(int i=0; i<m; i++){
            for(int j = 0; j<n; j++){
                int[] area = {0};
                if(grid[i][j] == 1){
                    dfs(grid,i,j,area);
                    if(area[0] > maxArea){
                        maxArea = area[0];
                    }
                }
            }
        }
        return maxArea;
    }
    private void dfs(int [][] grid, int i, int j, int[] area ){
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j] != 1){
            return;
        }

        area[0]++;

        grid[i][j] = -1;
        dfs(grid, i+1, j, area);
        dfs(grid, i-1, j, area);
        dfs(grid, i, j+1, area);
        dfs(grid, i, j-1, area);
    }

}