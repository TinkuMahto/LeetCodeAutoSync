class Solution {
    int LEFT = 0; // arrived from the left cell (was moving right)
    int UP = 1;   // arrived from the cell above (was moving down)
    int MOD = 1_000_000_007;
    int m, n;

    public int uniquePaths(int[][] grid) {
        m = grid.length;
        n = grid[0].length;

        // (m+1) x (n+1), zero-filled: row == m or col == n is "out of bounds" and reads as 0
        int[][][] t = new int[m + 1][n + 1][2];

        for (int row = m - 1; row >= 0; row--) {
            for (int col = n - 1; col >= 0; col--) {
                for (int cameFrom = 0; cameFrom < 2; cameFrom++) {

                    // Destination reached
                    if (row == m - 1 && col == n - 1) {
                        t[row][col][cameFrom] = 1;
                        continue;
                    }

                    // Mirror: reflect based on where we came from
                    if (grid[row][col] == 1) {
                        if (cameFrom == LEFT)
                            t[row][col][cameFrom] = t[row + 1][col][UP];   // came from left -> turn down
                        else
                            t[row][col][cameFrom] = t[row][col + 1][LEFT]; // came from up -> turn right
                        continue;
                    }

                    // Empty cell: branch into both moves
                    long total = 0;
                    total += t[row][col + 1][LEFT]; // move right, next cell is entered from its LEFT
                    total += t[row + 1][col][UP];   // move down, next cell is entered from its UP

                    t[row][col][cameFrom] = (int) (total % MOD);
                }
            }
        }

        return t[0][0][LEFT]; // starting cell is always 0 (use either UP or LEFT)
    }
}