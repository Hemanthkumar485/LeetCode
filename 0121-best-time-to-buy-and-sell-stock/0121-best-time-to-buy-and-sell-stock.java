class Solution {
    public int maxProfit(int[] num) {
        int pro = 0;
        int buy = num[0];
        for(int i = 1; i < num.length; i++) {
            if(buy > num[i]) {
                buy = num[i];
            }
            else if(num[i] - buy > pro) {
                pro = num[i] - buy;
            }
        }
        return pro;
    }
}