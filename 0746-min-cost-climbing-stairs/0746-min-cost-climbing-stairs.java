
//Bottom UP:-  Time: O(n) Space: O(1)
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if(n == 2){
            return Math.min(cost[0], cost[1]);
        }
        for(int i=2; i<n; i++){
            cost[i] =cost[i] + Math.min(cost[i-1], cost[i-2]);
        }
        return Math.min(cost[n-1], cost[n-2]);
    } 
}



// //Recursion + memoization 
// class Solution {
//     int dp[];
//     private int solve(int i,int []cost) {
//         int n = cost.length;
//         if(i >= n){
//             return 0;
//         }
//         if(dp[i] != -1){
//             return dp[i];
//         }
//         int a = cost[i] + solve(i+1, cost);
//         int b = cost[i] + solve(i+2, cost);

//         return dp[i] = Math.min(a, b);
//     }
//     public int minCostClimbingStairs(int[] cost) {
//         int n = cost.length;
//         dp = new int[n+1];
//         Arrays.fill(dp, -1);
//         int a = solve(0, cost);
//         int b = solve(1, cost);
//         return Math.min(a,b);
//     }
// }