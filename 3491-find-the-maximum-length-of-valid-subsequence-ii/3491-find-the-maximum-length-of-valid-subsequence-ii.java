class Solution {

    public int maximumLength(int[] nums, int k) {
        int[][] dp = new int[k][k];
        int r = 0;
        for (int n : nums) {
            n %= k;
            for (int i = 0; i < k; i++) {
                dp[i][n] = dp[n][i] + 1;
                r = Math.max(r, dp[i][n]);
            }
        }
        return r;
    }
}