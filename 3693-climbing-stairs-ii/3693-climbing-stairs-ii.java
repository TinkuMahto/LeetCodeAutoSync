class Solution {
    int memo[] ;
    public int climbStairs(int n, int[] costs) {
        memo = new int[n+1];
        Arrays.fill(memo, -1);
        return solve(0, n, costs);
    }

    private int solve(int i, int n, int[] costs){

        if(i == n) {
            return 0;
        }
        if(memo[i] != -1){
            return memo[i];
        }
        int cost = Integer.MAX_VALUE;

        int j = i+1;
        if(j <= n)
            cost = solve(j, n, costs) + costs[j-1] + (j-i) * (j-i);

        j = i+2;
        if(j <= n)
            cost = Math.min(cost, solve(j, n, costs) + costs[j-1] + (j-i) * (j-i));

        j = i+3;
        if( j<=n)
            cost = Math.min(cost, solve(j, n, costs) + costs[j-1] + (j-i) * (j-i));

        return memo[i] = cost;
    }
}