
//Space Optimization  Time:  O(n), Space: O(1)
class Solution{
    public int fib(int n){
        if(n <= 1){
            return n;
        }
        int prev2 = 0;
        int prev1 = 1;

        for(int i=2; i<=n; i++){
            int curr = prev1 + prev2;

            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}

//-------------------------------------------//
// //Tabulation  Time:  O(n), Space: O(n)
// class Solution{
//     public int fib(int n){
//         int dp[] = new int[n+1];
//         dp[0] = 0;
//         dp[1] = 1;

//         for(int i=2; i<=n; i++){
//             dp[i] = dp[i-1] + dp[i-2];
//         }
//         return dp[n];
//     }
// }


//------------------------------------------------//
// //Memoization  Time:  O(n), Space: O(n)
// class Solution{
    
//     private int fibMemo(int n, int[] dp){
//         if(n <= 1){
//             return n;
//         }
//         if(dp[n] != -1){
//             return dp[n];
//         }
//         dp[n] = fib(n-1) + fib(n-2);

//         return dp[n];
//     }
//     public int fib(int n){
//         int dp[] = new int [n+1];
//         Arrays.fill(dp, -1);
//         return fibMemo(n, dp);
//     }
// }


//---------------------------------------------------------

// //Recursion   Time: O(n^2), space: O(n)

// class Solution{
//     public int fib(int n){
//         if(n <= 1){
//             return n;
//         }
//         return fib(n-1) + fib(n-2);
//     }
// }

//-------------------------------------------------------//

// //first Approach (Bacsic Apprach)

// class Solution {
//     public int fib(int n) {
//         int num1=0;
//         int num2=1;
//         int num3=num1+num2;
//         if(n==0){
//             return 0;
//         }
//         for(int i=1;i<n;i++){
//             num3=num1+num2;
//             num1=num2;
//             num2=num3;   
//         }
//         return num3;
//     }
// }
