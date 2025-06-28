class Solution {
    // USING DYNAMIC PROGRAMMING:
    public int fib(int n, int [] dp) {
        if (n <= 1) return n;
        if (dp[n] != 0) return dp[n]; //NEW
        int ans = fib(n-1, dp) + fib(n-2, dp);
        dp[n] = ans;
        return ans;
    }
    public int fib(int n) {
        int [] dp = new int[n+1]; // MEMOIZATION ARRAY-> INDEX FROM 0-N:
        return fib(n, dp);
    }
}