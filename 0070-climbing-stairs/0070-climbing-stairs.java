//Space Optimization   Time: O(n), Space: O(1)
class Solution {
    public int climbStairs(int n) {
        if(n <= 2){
            return n;
        }
        int oneStepBefore  = 2;
        int twoStepsBefore  = 1;
        for(int i=3; i<=n; i++){
            int current = oneStepBefore + twoStepsBefore;
            twoStepsBefore = oneStepBefore;
            oneStepBefore  = current;
        }
        return oneStepBefore;
    }
}


// //Tabulation (Bottom-Up)  Time: O(n), Space: O(n)
// class Solution {
//     public int climbStairs(int n) {
//         if (n == 1) return 1;
//         if (n == 2) return 2;
//         int dp[] = new int[n+1];
//         dp[1] = 1;
//         dp[2] = 2;
//         for(int i = 3; i<=n; i++){
//             dp[i] = dp[i-1] + dp[i-2];
//         }
//         return dp[n];
//     }
// }



// //Memoization (Top-Down) :- Time: O(n), Space: O(n)
// class Solution {
//     private int ways(int n, int[] dp){
//         //base case
//         if (n == 1) return 1;
//         if (n == 2) return 2;
//         //Already calculated
//         if(dp[n] != -1){
//             return dp[n];
//         }
//         // to reach step n it can come from (n-1) or (n-2) 
//         dp[n] = ways(n-1, dp) + ways(n-2, dp);
//         return dp[n];
//     }
//     public int climbStairs(int n) {
        
//         int[] dp = new int[n+1];
//         Arrays.fill(dp, -1);

//         return ways(n, dp);
//     }
// }