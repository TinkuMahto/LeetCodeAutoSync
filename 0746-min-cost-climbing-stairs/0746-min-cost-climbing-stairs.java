class Solution {
    int dp[];
    private int solve(int i,int []cost) {
        int n = cost.length;
        if(i >= n){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int a = cost[i] + solve(i+1, cost);
        int b = cost[i] + solve(i+2, cost);

        return dp[i] = Math.min(a, b);
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        int a = solve(0, cost);
        int b = solve(1, cost);
        return Math.min(a,b);
    }
}