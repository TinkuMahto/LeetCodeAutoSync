class Solution {
    int n;
    int m;

    public int islandPerimeter(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                   return  dfs(grid, i, j);
                
                }
            }
        }
        return -1;
    }

    private int dfs(int[][] grid, int i, int j) {

        //outside grid or water = 1 perimeter
        if (i < 0 || i >= n || j < 0 || j >= m || grid[i][j] == 0) {
            return 1;
        }
        //already visited = no aditional perimeter 
        if(grid[i][j] == -1){
            return 0 ;
        }
        int perimeter = 0;
        //mark visited
        grid[i][j] = -1;

        perimeter +=  dfs(grid, i + 1, j);
        perimeter +=  dfs(grid, i - 1, j);
        perimeter +=  dfs(grid, i, j + 1);
        perimeter +=  dfs(grid, i, j - 1);

        return perimeter;

    }
}