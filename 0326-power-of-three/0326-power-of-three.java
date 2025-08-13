class Solution {
    public boolean isPowerOfThree(int n) {
        int a = 1162261467;
        return n > 0 && a % n == 0;
    }
}