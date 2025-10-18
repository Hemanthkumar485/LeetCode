class Solution {
    public int maxDivScore(int[] nums, int[] div) {
        int m = -1;
        int r = Integer.MAX_VALUE;
        for (int d : div) {
            int s = 0;
            for (int n : nums) {
                if (n % d == 0) {
                    s++;
                }
            }
            if (s > m || (s == m && d < r)) {
                m = s;
                r = d;
            }
        }
        return r;
    }
}