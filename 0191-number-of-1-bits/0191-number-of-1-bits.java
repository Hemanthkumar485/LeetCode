class Solution {
    public int hammingWeight(int n) {
        long a = Integer.bitCount(n);
        return (int)a;
    }
}