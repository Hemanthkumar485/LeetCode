class Solution {
    public int findDelayedArrivalTime(int a, int d) {
        int b = a + d;
        if(b % 24 == 0) return 0;
        else return b % 24;
    }
}