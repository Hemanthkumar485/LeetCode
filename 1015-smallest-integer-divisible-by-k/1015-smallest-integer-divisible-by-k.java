class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k % 2 == 0 || k % 5 == 0) {
            return -1;
        }
        int c = 1;
        int r = 1 % k;
        while(r != 0) {
            r = (r * 10 + 1) % k;
            c++;
        }
        return c;
    }
}