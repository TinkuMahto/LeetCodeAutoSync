
//Memoization
class Solution {
    private int ways(int n, int[] dp){
        //base case
        if(n <= 2){
            return n;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        // to reach step n it can come from (n-1) or (n-2) 
        dp[n] = ways(n-1, dp) + ways(n-2, dp);
        return dp[n];
    }
    public int climbStairs(int n) {
        
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);

        return ways(n, dp);
    }
}