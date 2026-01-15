class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int n1 = n * n;
        int a = n1 * w;
        if(a <= maxWeight) {
            return n1;
        }
        return maxWeight / w;
    }
}